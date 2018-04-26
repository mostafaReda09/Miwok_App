package com.example.android.miwok;

/**
 * Created by Mostafa on 3/31/2018.
 */

public class Word {
    private String english_word;
    private String miwak_word;
    private int word_image=-1;
    private int word_sound;
    public Word(String english_word,String miwak_word,int word_image,int word_sound){
        this.english_word=english_word;
        this.miwak_word=miwak_word;
        this.word_image=word_image;
        this.word_sound=word_sound;

    }
    public Word(String english_word,String miwak_word,int word_sound){
        this.english_word=english_word;
        this.miwak_word=miwak_word;
        this.word_sound=word_sound;


    }
    public String getMiwakWord()
    {
        return this.miwak_word;
    }
    public String getEnglishWord()
    {
        return this.english_word;
    }
    public int getImage()
    {
        return this.word_image;
    }
    public boolean has_image()
    {
        return word_image!=-1;
    }
    public int getSoundID(){return word_sound;}
}
