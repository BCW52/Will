package com.willdev.openvpn;

import android.net.Uri;

import com.willdev.openvpn.BuildConfig;

public class Utils {


    public static String getImgURL(int resourceId) {

        return Uri.parse("android.resource://" +  BuildConfig.APPLICATION_ID + "/" + resourceId).toString();
    }
}
