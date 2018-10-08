package com.andromeeda.project.onlinegallery;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Aswin on 08-Oct-18.
 */

public class SpacePhoto {
    private String mUrl;
    private String mTitle;

    public SpacePhoto(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    protected SpacePhoto(Parcel in) {
        mUrl = in.readString();
        mTitle = in.readString();
    }

    public static final Parcelable.Creator<SpacePhoto> CREATOR = new Parcelable.Creator<SpacePhoto>() {
        @Override
        public SpacePhoto createFromParcel(Parcel in) {
            return new SpacePhoto(in);
        }

        @Override
        public SpacePhoto[] newArray(int size) {
            return new SpacePhoto[size];
        }
    };
}
