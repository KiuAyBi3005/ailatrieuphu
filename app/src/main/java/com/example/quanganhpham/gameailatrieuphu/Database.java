package com.example.quanganhpham.gameailatrieuphu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by QuangAnhPham on 3/15/2017.
 */

public class Database extends SQLiteOpenHelper {
    private static String DATABASE_PATH = "";
    private static String DATABASE_NAME = "ailatrieuphu.sqlte";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "table_question";
    private SQLiteDatabase database;
    private Context mContext;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }

    public void openDatabase() throws SQLException {
        String myPath = DATABASE_NAME + DATABASE_PATH;
        database = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
    }

    public synchronized void close() {
        if (database != null)
            database.close();
        super.close();
    }

    private boolean checkDatabase() {
        SQLiteDatabase checkDB = null;
        String myPath = DATABASE_NAME + DATABASE_PATH;
        database = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        if (checkDB != null)
            checkDB.close();
        return checkDB != null ? true : false;
    }

    private void coppyDatabase() throws IOException {
        InputStream myInput = mContext.getAssets().open(DATABASE_NAME);
        String outFileName = DATABASE_PATH + DATABASE_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    public void createDatabase() throws IOException {
        boolean dbExist = checkDatabase();
        if (dbExist) {
        } else {
            this.getReadableDatabase();
        }
        try {
            coppyDatabase();
        } catch (IOException e) {
            throw new Error("Erorr coppy database");
        }
    }

    public Cursor allQuestion() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from table_question", null);
        return cursor;
    }

    public List<Question> randomQuestion(int number_question) {
        List<Question> list_question = new ArrayList<Question>();
        String limit = "0," + number_question;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, null, null, null, null, null, "ramdom|", limit);
        cursor.moveToFirst();
        do {
            Question question = new Question();
            question.mId = Integer.parseInt(cursor.getString(0));
            question.mQuestion = cursor.getString(1);
            question.mAnswerA = cursor.getString(2);
            question.mAnswerB = cursor.getString(3);
            question.mAnswerC = cursor.getString(4);
            question.mAnswerD = cursor.getString(5);
            question.mAnswersQuestions = cursor.getString(6);
            question.mAnswerPlayers = "";
            list_question.add(question);
        } while (cursor.moveToNext());
        return list_question;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
}
