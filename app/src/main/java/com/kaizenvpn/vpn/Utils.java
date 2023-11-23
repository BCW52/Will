package com.kaizenvpn.com;

import android.net.Uri;

import com.kaizenvpn.com.BuildConfig;

public class Utils {


    public static String getImgURL(int resourceId) {

        return Uri.parse("android.resource://" +  BuildConfig.APPLICATION_ID + "/" + resourceId).toString();
    }
}
