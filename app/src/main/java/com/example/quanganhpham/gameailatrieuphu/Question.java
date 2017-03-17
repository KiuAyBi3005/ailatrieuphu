package com.example.quanganhpham.gameailatrieuphu;

/**
 * Created by QuangAnhPham on 3/14/2017.
 */

public class Question {
    public int mId;
    public String mQuestion;
    public String mAnswerA;
    public String mAnswerB;
    public String mAnswerC;
    public String mAnswerD;
    public String mAnswersQuestions;
    public String mAnswerPlayers;

    public Question(int mId,
                    String mQuestion,
                    String mAnswerA,
                    String mAnswerB,
                    String mAnswerC,
                    String mAnswerD,
                    String mAnswersQuestions,
                    String mAnswerPlayers) {
        this.mId = mId;
        this.mQuestion = mQuestion;
        this.mAnswerA = mAnswerA;
        this.mAnswerB = mAnswerB;
        this.mAnswerC = mAnswerC;
        this.mAnswerD = mAnswerD;
        this.mAnswersQuestions = mAnswersQuestions;
        this.mAnswerPlayers = mAnswerPlayers;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    public String getmAnswerA() {
        return mAnswerA;
    }

    public void setmAnswerA(String mAnswerA) {
        this.mAnswerA = mAnswerA;
    }

    public String getmAnswerB() {
        return mAnswerB;
    }

    public void setmAnswerB(String mAnswerB) {
        this.mAnswerB = mAnswerB;
    }

    public String getmAnswerC() {
        return mAnswerC;
    }

    public void setmAnswerC(String mAnswerC) {
        this.mAnswerC = mAnswerC;
    }

    public String getmAnswerD() {
        return mAnswerD;
    }

    public void setmAnswerD(String mAnswerD) {
        this.mAnswerD = mAnswerD;
    }

    public String getmAnswersQuestions() {
        return mAnswersQuestions;
    }

    public void setmAnswersQuestions(String mAnswersQuestions) {
        this.mAnswersQuestions = mAnswersQuestions;
    }

    public String getmAnswerPlayers() {
        return mAnswerPlayers;
    }

    public void setmAnswerPlayers(String mAnswerPlayers) {
        this.mAnswerPlayers = mAnswerPlayers;
    }



    public Question() {
    }

}