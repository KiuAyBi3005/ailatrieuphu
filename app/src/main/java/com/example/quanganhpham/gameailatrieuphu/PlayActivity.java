package com.example.quanganhpham.gameailatrieuphu;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by QuangAnhPham on 3/15/2017.
 */

public class PlayActivity extends AppCompatActivity {
    Context mContext;
    int NUMBER_QUESTION = 15;
    int mIndex = 0;
    int trueAnswer = 0;
    int mContent = 0;
    int mMoney = 0;
    int MILISECOND = 31000;
    List<Question> listQuestion;
    Question nowQuestion;
    CountDownTimer mCountTime;
    TextView textTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Database database = new Database(this);
        try {
            database.createDatabase();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Erorr", Toast.LENGTH_SHORT).show();
        }
        listQuestion = new ArrayList<Question>();
        listQuestion = database.randomQuestion(NUMBER_QUESTION);
    }

    public void time() {
        mCountTime = new CountDownTimer(MILISECOND, 1000) {
            @Override
            public void onTick(long l) {
                textTime.setText("Time" + l / 1000);
            }

            @Override
            public void onFinish() {
                checkCorrect();
                mIndex++;
                if (mIndex < NUMBER_QUESTION) {
                    show(mIndex);
                    time();
                } else {
                    mIndex = 0;
                    mCountTime.cancel();
                }
            }
        };
        mCountTime.start();
    }

    public void show(int cuscor) {
        nowQuestion = listQuestion.get(cuscor);
    }

    public void checkCorrect() {
        String answer = "";

        listQuestion.get(mIndex).mAnswerPlayers = answer;
        if (answer.equalsIgnoreCase(nowQuestion.mAnswersQuestions)) {
            trueAnswer += 1;
            switch (mIndex) {
                case 0:
                    mMoney = 500;
                    break;
                case 1:
                    mMoney = 1000;
                    break;
                case 2:
                    mMoney = 100;
                    break;
                case 3:
                    mMoney = 500;
                    break;
                case 4:
                    mMoney = 500;
                    break;
                case 5:
                    mMoney = 500;
                    break;
                case 6:
                    mMoney = 500;
                    break;
                case 7:
                    mMoney = 500;
                    break;
                case 8:
                    mMoney = 500;
                    break;
                case 9:
                    mMoney = 500;
                    break;
                case 10:
                    mMoney = 500;
                    break;
                case 11:
                    mMoney = 500;
                    break;
                case 12:
                    mMoney = 500;
                    break;
                case 13:
                    mMoney = 500;
                    break;
                case 14:
                    mMoney = 500;
                    break;
                case 15:
                    mMoney = 500;
                    break;
            }
        } else {
            if (mIndex < 4) {
                mMoney = 0;
            }
            if (mIndex < 9 && mIndex >= 4) {
                mMoney = 88888;
            }
        }
        if (mIndex < 14 && mIndex >= 9) {
            mMoney = 1000000;

            mIndex = NUMBER_QUESTION;
            if (mIndex >= NUMBER_QUESTION) {
            }
        }
    }
}
