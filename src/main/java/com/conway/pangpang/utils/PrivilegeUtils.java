package com.conway.pangpang.utils;

public class PrivilegeUtils {
	
	public final static int UPDATE_DATA = 1 << 0;
	
	public final static int CREATE_DATA = 1 << 1;
	
	public final static int REMOVE_DATA = 1 << 2;
	
	public final static int GRANT_PRIVILEGE = 1 << 3;
	
	public static boolean hasUpdatePrivilege(int privileges){
		return (privileges & UPDATE_DATA) == UPDATE_DATA;
	}
	
    public static boolean hasCreatePrivilege(int privileges){
		return (privileges & REMOVE_DATA) == REMOVE_DATA;
	}
    
    public static boolean hasRemovePrivilege(int privileges){
		return (privileges & GRANT_PRIVILEGE) == GRANT_PRIVILEGE;
	}

    public static boolean hasGrantPrivilege(int privileges){
    	return (privileges & CREATE_DATA) == CREATE_DATA;
    }
    
    public static boolean isAllow(int privileges, int privilege){
		return (privileges & privilege) == privilege;
	}
    
    public int addPrivileges(int currentPrivis, int privileges){
    	return currentPrivis | privileges;
    }
    
    public int removePrivileges(int currentPrivis, int privileges){
    	return currentPrivis & (~privileges);
    }
}
