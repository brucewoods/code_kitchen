package com.example.a1stapp.dummy;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.a1stapp.R;


public class MyData {
    public int number;
    private Context context;

    public MyData(Context context){
        this.context=context;
    }
    public void save(){
        String name=context.getResources().getString(R.string.Localstorage);
        String key=context.getResources().getString(R.string.Datakey);
        SharedPreferences shp=context.getSharedPreferences(name,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=shp.edit();

        editor.putInt(key,number);
        editor.apply();
    }
    public void load(){
        String name=context.getResources().getString(R.string.Localstorage);
        String key=context.getResources().getString(R.string.Datakey);
        int  def=context.getResources().getInteger(R.integer.DEF_VAL);
       SharedPreferences shp=context.getSharedPreferences(name,Context.MODE_PRIVATE);
        int x=shp.getInt(name,def);
        number=x;
    }
}
