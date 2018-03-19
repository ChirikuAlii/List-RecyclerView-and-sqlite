package com.example.chirikualii.listwithdb.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by chirikualii on 19/03/18.
 */

public class DatabaseOpenHelper extends SQLiteAssetHelper{


    private static final String DATABASES_NAME = "database.db";
    private static final int DATABASES_VERSION = 1;

    public DatabaseOpenHelper(Context context) {

        super(context, DATABASES_NAME, null, DATABASES_VERSION);
    }
}
