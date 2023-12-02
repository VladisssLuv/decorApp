package com.hackathon.decor.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.hackathon.decor.ApplicationLoader;

public class SPHelper {
    public static final String FILE_NAME = "appdecor";
    public static final String TOKEN = "token";

    private static SharedPreferences getPrefs() {return ApplicationLoader.getInstance().getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);}

    private static SharedPreferences.Editor getEdit() {
        return getPrefs().edit();
    }
    public static void setToken(String token) {
        getEdit().putString(TOKEN, token).commit();
    }
    public static String getToken() {
        return getPrefs().getString(TOKEN, "");
    }
}
