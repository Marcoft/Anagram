package com.example.anagram.databas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelpersPharmacy extends SQLiteOpenHelper {

    // Database Name
    private static final String DATABASE_NAME = "DBHelpers";

    // Todo table create pharmacy
    private static final String CREATE_TABLE_Money =
            "CREATE TABLE Money (id INTEGER PRIMARY KEY NOT NULL, " +
                    "countMoney INTEGER NOT NULL); ";




    public DBHelpersPharmacy(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL(CREATE_TABLE_Money);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Money");

        onCreate(db);
    }




}
