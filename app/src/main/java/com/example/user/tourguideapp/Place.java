package com.example.user.tourguideapp;

public class Place {
    private int mName;
    private int mAddress;
    private int mPhone;
    private int mWebsite;
    private int mImageResourceId;

    public Place(int name, int address, int phone, int website, int imageResourceId) {
        mName = name;
        mAddress = address;
        mPhone = phone;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    public int getName() {
        return mName;
    }

    public int getAddress() { return mAddress; }

    public int getPhone() {
        return mPhone;
    }

    public int getWebsite() { return mWebsite; }

    public int getImageResourceId() { return mImageResourceId; }
}
