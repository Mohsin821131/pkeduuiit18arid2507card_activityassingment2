package com.example.pkeduuiit18_arid_2507card_activityassingment2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {
    public DBhelper( Context context) {
        super(context, "Quiz2", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table userdata( name Text primary Key,email text ,password text,gander text,subject text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists userdata");
    }
    public Boolean insertQuiz2(String name, String email, String password, String gander, String subject)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("email",email);
        contentValues.put("password",password);
        contentValues.put("gander",gander);
        contentValues.put("subject",subject);
        long result=db.insert("userdata",null,contentValues);
        if (result==-1){
            return false;
        }
        else{
            return true;
        }
    }
    public Cursor login(String email, String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor userdata = db.rawQuery("Select * from userdata where email = '"+email+"' AND password = '"+password+"'",null);
        return userdata;
    }
}
