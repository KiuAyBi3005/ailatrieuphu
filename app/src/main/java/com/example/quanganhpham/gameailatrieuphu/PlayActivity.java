package com.example.quanganhpham.gameailatrieuphu;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
    String answer = "";
    Context context;
    int number_question = 15;
    int index = 0;
    List<Question> list_question;
    Question now_question;
    int true_answer = 0;
    int content = 0;
    int money = 0;
    int miliSecond = 31000;
    CountDownTimer countTime, depay;
    TextView text_question, text_notification, text_time, text_money;
    RadioButton radio_answer_a, radio_answer_b, radio_answer_c, radio_answer_d;
    RadioGroup radioGroup;
    Button button_confirm, button_check;
    CheckBox checkbox_5050, checkbox_ask_audience, checkbox_call, checkbox_nextquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        checkbox_5050 = (CheckBox) findViewById(R.id.checkbox_5050);
        checkbox_nextquestion = (CheckBox) findViewById(R.id.checkbox_nextquestion);
        checkbox_call = (CheckBox) findViewById(R.id.checkbox_call);
        checkbox_ask_audience = (CheckBox) findViewById(R.id.checkbox_ask_audience);
        text_question = (TextView) findViewById(R.id.text_question);
        text_money = (TextView) findViewById(R.id.text_money);
        text_time = (TextView) findViewById(R.id.text_time);
        text_notification = (TextView) findViewById(R.id.text_notification);
        radio_answer_a = (RadioButton) findViewById(R.id.radio_answer_a);
        radio_answer_a = (RadioButton) findViewById(R.id.radio_answer_a);
        radio_answer_c = (RadioButton) findViewById(R.id.radio_answer_c);
        radio_answer_d = (RadioButton) findViewById(R.id.radio_answer_d);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        button_confirm = (Button) findViewById(R.id.button_confirm);
        button_check = (Button) findViewById(R.id.button_check);
        text_notification.setTextColor(Color.YELLOW);
        text_question.setTextColor(Color.YELLOW);
        text_time.setTextColor(Color.YELLOW);
        text_money.setTextColor(Color.YELLOW);
        radio_answer_a.setTextColor(Color.WHITE);
        radio_answer_b.setTextColor(Color.WHITE);
        radio_answer_c.setTextColor(Color.WHITE);
        radio_answer_d.setTextColor(Color.WHITE);
        button_check.setTextColor(View.GONE);
        Database db = new Database(this);
        try {
            db.createDatabase();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Erorr", Toast.LENGTH_SHORT).show();
        }
        list_question = new ArrayList<Question>();
        list_question = db.randomQuestion(number_question);


    }

    public void time() {
        countTime = new CountDownTimer(miliSecond, 1000) {
            @Override
            public void onTick(long l) {
                text_time.setText("Time" + l / 1000);
            }

            @Override
            public void onFinish() {
                checkCorrect();
                index++;
                if (index < number_question) {
                    show(index);
                    time();
                } else {
                    index = 0;
                    button_confirm.setVisibility(View.GONE);
                    button_check.setVisibility(View.VISIBLE);
                    text_time.setVisibility(View.GONE);
                    countTime.cancel();
                }
            }
        };
        countTime.start();
    }

    public void show(int cuscor) {
        radio_answer_a.setTextColor(Color.WHITE);
        radio_answer_b.setTextColor(Color.WHITE);
        radio_answer_c.setTextColor(Color.WHITE);
        radio_answer_d.setTextColor(Color.WHITE);
        text_notification.setText("Sentence :" + (cuscor + 1) + "/" + (number_question));
        now_question = list_question.get(cuscor);
        text_money.setText(now_question.mQuestion);
        text_money.setText("You got :" + money + " USD");
        radio_answer_a.setText(now_question.mAnswer_a);
        radio_answer_b.setText(now_question.mAnswer_b);
        radio_answer_c.setText(now_question.mAnswer_c);
        radio_answer_d.setText(now_question.mAnswer_d);
        radioGroup.clearCheck();
    }

    public void checkCorrect() {
        String answer = "";
        if (radio_answer_a.isChecked() == true) {
            answer = "a";
        } else if (radio_answer_b.isChecked() == true) {
            answer = "b";
        } else if (radio_answer_c.isChecked() == true) {
            answer = "c";
        } else if (radio_answer_d.isChecked() == true) {
            answer = "d";
        }
        list_question.get(index).mAnswer_players = answer;
        if (answer.equalsIgnoreCase(now_question.mAnswers_questions)) {
            true_answer += 1;
            switch (index) {
                case 0:
                    money = 500;
                    break;
                case 1:
                    money = 1000;
                    break;
                case 2:
                    money = 100;
                    break;
                case 3:
                    money = 500;
                    break;
                case 4:
                    money = 500;
                    break;
                case 5:
                    money = 500;
                    break;
                case 6:
                    money = 500;
                    break;
                case 7:
                    money = 500;
                    break;
                case 8:
                    money = 500;
                    break;
                case 9:
                    money = 500;
                    break;
                case 10:
                    money = 500;
                    break;
                case 11:
                    money = 500;
                    break;
                case 12:
                    money = 500;
                    break;
                case 13:
                    money = 500;
                    break;
                case 14:
                    money = 500;
                    break;
                case 15:
                    money = 500;
                    break;
            }
            text_money.setText("You got :" + money + "  USD");
            text_money.setTextColor(Color.YELLOW);
        } else {
            if (index < 4) {
                money = 0;
            }
            if (index < 9 && index >= 4) {
                money = 88888;
            }
        }
        if (index < 14 && index >= 9) {
            money = 1000000;
            text_money.setTextColor(Color.YELLOW);
            text_money.setText("You got :" + money + "  USD");
            index = number_question;
            if (index >= number_question) {
                text_notification.setText("Total :");
                text_question.setText("Your right choose" + true_answer + "sentences");
                radio_answer_a.setVisibility(View.GONE);
                radio_answer_b.setVisibility(View.GONE);
                radio_answer_c.setVisibility(View.GONE);
                radio_answer_d.setVisibility(View.GONE);

            }
        }
    }
}
