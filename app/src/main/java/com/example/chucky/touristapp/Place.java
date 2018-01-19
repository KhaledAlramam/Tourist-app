package com.example.chucky.touristapp;

//FINISHED
//A class to represent each place
public class Place {

    public String mTitle,mDesc;
    public int mImgId;
    public Place(String title,int imgId,String desc){
        mTitle=title;
        mImgId=imgId;
        mDesc=desc;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmImgId() {
        return mImgId;
    }

    public String getmDesc() {
        return mDesc;
    }
}
