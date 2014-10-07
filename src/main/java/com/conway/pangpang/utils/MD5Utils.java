package com.conway.pangpang.utils;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

public class MD5Utils {

	public static String encode(String str) throws Exception{
		MessageDigest messageDigest = null; 
		 
        messageDigest = MessageDigest.getInstance("MD5"); 
        messageDigest.reset(); 
        messageDigest.update(str.getBytes("UTF-8")); 
      
        byte[] byteArray = messageDigest.digest(); 

        StringBuffer md5StrBuff = new StringBuffer(); 
        for (int i = 0; i < byteArray.length; i++) {             
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1) 
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i])); 
            else 
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i])); 
        } 
 
        return md5StrBuff.toString(); 
	}
}
