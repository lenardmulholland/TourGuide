package com.example.android.tourguide;

public class Location {

    private String mLocationTitle;
    private String mInfoLine1;
    private String mInfoLine2;
    private String mInfoLine3;
    private String mInfoLine4;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String locationTitle, String infoLine1, String infoLine2, String infoLine3, String infoLine4){
        mLocationTitle = locationTitle;
        mInfoLine1 = infoLine1;
        mInfoLine2 = infoLine2;
        mInfoLine3 = infoLine3;
        mInfoLine4 = infoLine4;
    }

    public Location(String locationTitle, String infoLine1, String infoLine2, String infoLine3, String infoLine4, int imageResourceId){
        mLocationTitle = locationTitle;
        mInfoLine1 = infoLine1;
        mInfoLine2 = infoLine2;
        mInfoLine3 = infoLine3;
        mInfoLine4 = infoLine4;
        mImageResourceId = imageResourceId;
    }

    public String getLocationTitle(){return mLocationTitle; }
    public String getInfoLine1(){
        return mInfoLine1;
    }
    public String getInfoLine2(){
        return mInfoLine2;
    }
    public String getInfoLine3(){
        return mInfoLine3;
    }
    public String getInfoLine4(){
        return mInfoLine4;
    }
    public int getImageResourceId(){return mImageResourceId; }

    public boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED; }
}