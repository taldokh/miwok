package com.example.android.miwok;

public class Word {

    private String mDefultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String mDefultTranslation, String mMiwokTranslation, int mAudioResourceId) {
        this.mDefultTranslation = mDefultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mDefultTranslation, String mMiwokTranslation, int imageResourceId, int mAudioResourceId) {
        this.mDefultTranslation = mDefultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getDefultTranslation() {
        return mDefultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() { return mAudioResourceId; }
}
