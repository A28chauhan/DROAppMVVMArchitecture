package com.carematix.droapp.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class DefaultPreference {

    Context mContext;
    SharedPreferences sh;
    SharedPreferences.Editor editor;

    public DefaultPreference(Context paramContext) {
        try {
            this.mContext = paramContext;
            this.sh = this.mContext.getSharedPreferences(PrefConstants.PREFERENCE_DEFAULT_NAME, 0);
            this.editor = this.sh.edit();
            return;
        } catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void setStringValue(String prefName, String prefValue){
        //set string value
        editor.putString(prefName,prefValue);
        editor.commit();
    }

    // get string value
    public String getStringValue(String prefName){
        return sh.getString(prefName,null);
    }

    // set boolean value
    public void setBooleanValue(String preName, boolean prefValue){
        editor.putBoolean(preName,prefValue);
        editor.commit();
    }

    // get boolean value
    public boolean getBooleanValue(String prefName){
        //get boolean value
        return sh.getBoolean(prefName,false);
    }

    // set integer value
    public void setIntegerValue(String prefName, int prefValue){
        editor.putInt(prefName,prefValue);
        editor.commit();
    }

    // get integer value
    public int getIntegerValue(String prefName){
        return sh.getInt(prefName , 0);
    }

    // set long value in preference
    public void setLongValue(String prefName, long prefValue){
        editor.putLong(prefName,prefValue);
        editor.commit();
    }
    // get long value
    public long getLongValue(String prefName){return sh.getLong(prefName,0);}

    public void clearPref(){
        editor.clear();
        editor.commit();
    }
}
