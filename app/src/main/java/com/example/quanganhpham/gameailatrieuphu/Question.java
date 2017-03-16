package com.example.quanganhpham.gameailatrieuphu;

/**
 * Created by QuangAnhPham on 3/14/2017.
 */

public class Question {
    public int mId;
    public String mQuestion;
    public String mAnswer_a;
    public String mAnswer_b;
    public String mAnswer_c;
    public String mAnswer_d;
    public String mAnswers_questions;
    public String mAnswer_players;


    public Question() {
    }

    public Question(
            int mId,
            String mAnswer_a,
            String mAnswer_b,
            String mAnswer_c,
            String mAnswer_d,
            String mAnswers_questions,
            String mAnswer_players) {
        super();
        this.mId = mId;
        this.mAnswer_a = mAnswer_a;
        this.mAnswer_b = mAnswer_b;
        this.mAnswer_c = mAnswer_c;
        this.mAnswer_d = mAnswer_d;
        this.mAnswers_questions = mAnswers_questions;
        this.mAnswer_players = mAnswer_players;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public String getAnswer_a() {
        return mAnswer_a;
    }

    public void setAnswer_a(String mAnswer_a) {
        this.mAnswer_a = mAnswer_a;
    }

    public String getAnswer_b() {
        return mAnswer_b;
    }

    public void setAnswer_b(String mAnswer_b) {
        this.mAnswer_b = mAnswer_b;
    }

    public String getAnswer_c() {
        return mAnswer_c;
    }

    public void setAnswer_c(String mAnswer_c) {
        this.mAnswer_c = mAnswer_c;
    }

    public String getAnswer_d() {
        return mAnswer_d;
    }

    public void setAnswer_d(String mAnswer_d) {
        this.mAnswer_d = mAnswer_d;
    }

    public String getAnswers_questions() {
        return mAnswers_questions;
    }

    public void setAnswers_questions(String mAnswers_questions) {
        this.mAnswers_questions = mAnswers_questions;
    }

    public String getAnswer_players() {
        return mAnswer_players;
    }

    public void setAnswer_players(String mAnswer_players) {
        this.mAnswer_players = mAnswer_players;
    }


}
