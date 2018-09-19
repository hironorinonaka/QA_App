package jp.techacademy.hironori.nonaka.qa_app;

import java.io.Serializable;
import java.util.ArrayList;


//FireBaseから取得した質問データを保持するモデルクラス
public class Question implements Serializable {

    private String mTitle;//Firebaseから取得したタイトル
    private String mBody;//FireaBaseから取得した質問本文
    private String mName;//FirebBaseから取得した質問者の名前
    private String mUid;//FireBaseから取得した質問者のUID
    private String mQuestionUid;//Firebaseから取得した質問のUID
    private int mGenre;//質問のジャンル
    private byte[] mBitmapArray;//Firebaseから取得した画像をbyte型の配列にしたもの
    private ArrayList<Answer> mAnswerArrayList;//Firebaseから取得した質問のモデルクラスであるAnswerのArrayList

    public String getTitle() {
        return mTitle;
    }

    public String getBody() {
        return mBody;
    }

    public String getName() {
        return mName;
    }

    public String getUid() {
        return mUid;
    }

    public String getQuestionUid() {
        return mQuestionUid;
    }
    public int getGenre() {
        return mGenre;
    }

    public byte[] getImageBytes() {
        return mBitmapArray;
    }

    public ArrayList<Answer> getAnswers() {
        return mAnswerArrayList;
    }

    public Question(String title, String body, String name, String uid, String questionUid, int genre, byte[] bytes, ArrayList<Answer> answers) {
        mTitle = title;
        mBody = body;
        mName = name;
        mUid = uid;
        mQuestionUid = questionUid;
        mGenre = genre;
        mBitmapArray = bytes.clone();
        mAnswerArrayList = answers;
    }
}