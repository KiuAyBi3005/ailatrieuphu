package com.example.quanganhpham.gameailatrieuphu;

/**
 * Created by QuangAnhPham on 3/14/2017.
 */

public class Question {
    private int mKey_question;
    private String mContent_question;

    public Question(int mKey_question, String mContent_question) {
        this.mKey_question = mKey_question;
        this.mContent_question = mContent_question;
    }

    private Question() {
    }

    public int getmKey_question() {
        return mKey_question;
    }

    public void setmKey_question(int mKey_question) {
        this.mKey_question = mKey_question;
    }

    public String getmContent_question() {
        return mContent_question;
    }

    public void setmContent_question(String mContent_question) {
        this.mContent_question = mContent_question;
    }


}
