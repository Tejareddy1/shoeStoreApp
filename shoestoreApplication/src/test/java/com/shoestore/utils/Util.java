package com.shoestore.utils;

/**
 * Created by tejeshr on 4/4/17.
 */
public class Util {
    public static String getOsName() {
        return System.getProperty("os.name", "unknown");
    }

    public static boolean isWindows() {
        return (getOsName().toLowerCase().indexOf("windows") >= 0);
    }

    public static boolean isLinux() {
        return getOsName().toLowerCase().indexOf("linux") >= 0;
    }
    public static boolean isMac() {
        return getOsName().toLowerCase().indexOf("mac") >= 0;
    }

}
