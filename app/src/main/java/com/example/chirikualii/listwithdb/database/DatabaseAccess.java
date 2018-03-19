package com.example.chirikualii.listwithdb.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.chirikualii.listwithdb.Model.Dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chirikualii on 19/03/18.
 */

public class DatabaseAccess {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    private DatabaseAccess (Context context){
        this.openHelper = new DatabaseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context){
        if (instance== null){
            instance = new DatabaseAccess(context);
        }

        return instance;
    }

    public void open(){
        this.database = openHelper.getWritableDatabase();
    }

    public void close(){
        if (database!=null){
            this.database.close();
        }
    }

    public List<Dictionary> getTitle(){

        List<Dictionary> dictionaryList = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM tbl_kamus",null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Dictionary dictionary = new Dictionary();

            dictionary.setTitle(cursor.getString(1));

            dictionaryList.add(dictionary);
            cursor.moveToNext();
        }
        cursor.close();
    return  dictionaryList;
    }
}
