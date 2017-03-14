package com.example.quanganhpham.gameailatrieuphu;

/**
 * Created by QuangAnhPham on 3/14/2017.
 */

public class Answer {
    private int mKey_answer;
    private int mKey_question;
    private String mAnswer_a;
    private String mAnswer_b;
    private String mAnswer_c;
    private String mAnswer_d;

    public Answer(int mKey_answer, int mKey_question, String mAnswer_a, String mAnswer_b, String mAnswer_c, String mAnswer_d) {
        this.mKey_answer = mKey_answer;
        this.mKey_question = mKey_question;
        this.mAnswer_a = mAnswer_a;
        this.mAnswer_b = mAnswer_b;
        this.mAnswer_c = mAnswer_c;
        this.mAnswer_d = mAnswer_d;
    }

    private Answer() {
    }

    public int getmKey_answer() {
        return mKey_answer;
    }

    public void setmKey_answer(int mKey_answer) {
        this.mKey_answer = mKey_answer;
    }

    public int getmKey_question() {
        return mKey_question;
    }

    public void setmKey_question(int mKey_question) {
        this.mKey_question = mKey_question;
    }

    public String getmAnswer_a() {
        return mAnswer_a;
    }

    public void setmAnswer_a(String mAnswer_a) {
        this.mAnswer_a = mAnswer_a;
    }

    public String getmAnswer_b() {
        return mAnswer_b;
    }

    public void setmAnswer_b(String mAnswer_b) {
        this.mAnswer_b = mAnswer_b;
    }

    public String getmAnswer_c() {
        return mAnswer_c;
    }

    public void setmAnswer_c(String mAnswer_c) {
        this.mAnswer_c = mAnswer_c;
    }

    public String getmAnswer_d() {
        return mAnswer_d;
    }

    public void setmAnswer_d(String mAnswer_d) {
        this.mAnswer_d = mAnswer_d;
    }
}
