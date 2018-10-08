package com.andromeeda.project.onlinegallery;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Aswin on 08-Oct-18.
 */

public class SpacePhoto implements Parcelable{
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
    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static  SpacePhoto[] getSpacePhotos() {

        return new SpacePhoto[]{
                new SpacePhoto("https://1.bp.blogspot.com/-ojpRq682VU8/W7soY5euSlI/AAAAAAAAAAk/3zFSSD_uohwzV_pXWT6VGeyiP0d7kXErQCLcBGAs/s1600/home_img1.jpg", "Ariana 1"),
                new SpacePhoto("https://2.bp.blogspot.com/-J09au22dz9Y/W7sod4n8_XI/AAAAAAAAABM/jZx9bXeNTyUlFHX86jJrVSG9raaTjhwKgCLcBGAs/s1600/home_img2.jpg", "Ariana 2"),
                new SpacePhoto("https://1.bp.blogspot.com/-ByngB6bLeao/W7sojOv1SuI/AAAAAAAAAB4/41ebxcprqlg7aOK8tKyXmZpsruoFOFqtgCLcBGAs/s1600/home_img3.jpg", "Ariana 3"),
                new SpacePhoto("https://2.bp.blogspot.com/-KUpI6LKcny4/W7sokApvqbI/AAAAAAAAACA/gIxeu-aEBuYFaNJhVZxnHnZH34utmnnnQCLcBGAs/s1600/home_img4.jpg", "Ariana 4"),
                new SpacePhoto("https://2.bp.blogspot.com/-aGKkZLvBlN8/W7soks1l8QI/AAAAAAAAACE/MTOLyn0LVpAGbmfMhKTurf10xESgPTlbgCLcBGAs/s1600/home_img5.jpg", "Ariana 5"),
                new SpacePhoto("https://2.bp.blogspot.com/-RORl6AFyxLI/W7solHwIrKI/AAAAAAAAACI/077_SFrtCXYV3M7501Qa84bvF08V2w3RgCLcBGAs/s1600/home_img6.jpg", "Ariana 6"),
        };
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
        parcel.writeString(mTitle);
    }

}
