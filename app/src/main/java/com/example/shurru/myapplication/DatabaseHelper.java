package com.example.shurru.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Shurru on 03-08-2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="contacts.db";
    private static final String TABLE_NAME="contacts";
    private static final String COLUMN_NAME="FullName";
    private static final String COLUMN_ID="id";
    private static final String COLUMN_EMAIL="Email";
    private static final String COLUMN_UNAME="UserName";
    private static final String COLUMN_GENDER="Gender";
    private static final String COLUMN_PASS="Password";
    private static final String COLUMN_CONTACT="Contact";
    SQLiteDatabase db;

    public DatabaseHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.context=context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String TABLE_CREATE="create table"+TABLE_NAME+"("+COLUMN_ID+"integer not null primary key,"
                +COLUMN_NAME+"text not null,"
                +COLUMN_UNAME+"text not null,"
                +COLUMN_EMAIL+"text not null,"
                +COLUMN_GENDER+"text not null,"
                +COLUMN_PASS+"text not null,"
                +COLUMN_CONTACT+"text not null"+")";

    db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
   db.execSQL("Drop Table If Exists"+TABLE_NAME);
        onCreate(db);
    }
    public void insert(String name,String email,String uname,String gender,String contact)
    {
        db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        String query="select * from"+TABLE_NAME;
        Cursor cursor=db.rawQuery(query,null);
        int count=cursor.getCount();

        cv.put(COLUMN_ID,count);
        cv.put(COLUMN_NAME,name);
        cv.put(COLUMN_UNAME,uname);
        cv.put(COLUMN_EMAIL,email);
        cv.put(COLUMN_GENDER,gender);
        cv.put(COLUMN_CONTACT,contact);
        db.insert(TABLE_NAME,null,cv);
        db.close();
    }
    public void passinsert(String password)
    {
        db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(COLUMN_PASS,password);
        db.close();
    }
    public String searchpass(String uname)
    {
        db=this.getReadableDatabase();
        String query="select uname,password from"+TABLE_NAME;
        Cursor cursor =db.rawQuery(query,null);
        String a,b;
        b="not found";
        if(cursor.moveToFirst()) {
            do {
                a = cursor.getString(0);
                if (a.equals(uname)) {
                    b = cursor.getString(1);
                    break;
                }
            }
            while (cursor.moveToNext());


        }
        return b;
    }
}
