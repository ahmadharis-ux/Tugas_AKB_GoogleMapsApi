package com.example.tugassensor_10119266.models;

import com.example.tugassensor_10119266.R;

public enum ModelObject {
    /*
     * NIM : 10119266
     * NAMA : Ahmad Haris
     * Kelas : IF-7
     * */
    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue);
//    GREEN(R.string.green, R.layout.view_green);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}