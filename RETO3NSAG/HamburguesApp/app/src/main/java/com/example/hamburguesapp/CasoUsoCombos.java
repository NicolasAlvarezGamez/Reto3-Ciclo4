package com.example.hamburguesapp;

import android.database.Cursor;

public class CasoUsoCombos {
    public String cursorToString(Cursor cursor){
        if(cursor.getCount() == 0){
            return "No Hay Datos";
        }else{
            StringBuffer buffer = new StringBuffer();
            while(cursor.moveToNext()){
                buffer.append("ID: "+cursor.getString(0)+"\n");
                buffer.append("NAME: "+cursor.getString(1)+"\n\n");
            }
            return buffer.toString();
        }
    }
}
