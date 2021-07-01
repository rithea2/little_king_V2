package com.rithea.littlekingcafe;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    final static int DBVersion = 1;


    public DBHelper(@Nullable Context context) {
        super(context, "mylittle_king.db", null, DBVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE orderFood(id integer primary key autoincrement, name text, phone text, price integer, image integer, quantity integer, description text, foodName text)";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insertOrder(String name, String phone, int price, int image, int quantity, String desc, String foodName) {
        SQLiteDatabase database = getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("phone",phone);
        values.put("price",price);
        values.put("image",image);
        values.put("quantity", quantity);
        values.put("description",desc);
        values.put("foodName",foodName);
        long id = database.insert("orderFood",null,values);
        if (id<=0){
            return false;
        }else {
            return true;
        }

    }

}