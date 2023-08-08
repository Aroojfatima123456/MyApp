package com.example.mydatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {

    public static final String Table_Name = "RecordUsers";
    public static final String DataBase_Name = "SqliteDatabase";
    public static final int Version = 1;
    public static final String USERNAME = "UserName";
    public static final String PASSWORD = "Password";
    public static final String ID = "Id";

    public static final String query = " CREATE TABLE " + Table_Name + "(" + ID +"INTEGER PRIMARY KEY AUTOINCREMENT," + USERNAME+ "TEXT,"  + PASSWORD +" Text " + ")";


    public database(@Nullable Context context) {
        super(context, DataBase_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void saveData(database db,String USERNAME , String PASSWORD){
        SQLiteDatabase dob = db.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(USERNAME,USERNAME);
        cv.put(PASSWORD , PASSWORD);

        double myvalue = dob.insert(Table_Name,null,cv);

    }
}
