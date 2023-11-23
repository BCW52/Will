package com.kaizenvpn.vpn;

import android.net.Uri;

import com.kaizenvpn.vpn.BuildConfig;

public class Utils {


    public static String getImgURL(int resourceId) {

        return Uri.parse("android.resource://" +  BuildConfig.APPLICATION_ID + "/" + resourceId).toString();
    }
}
