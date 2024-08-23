package com.example.wiki.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
    public static String md5(String src) {
        if (src == null) {
            return null;
        }
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(src.getBytes());
            return new BigInteger(1, md5.digest()).toString(16);
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return null;
    }
}
