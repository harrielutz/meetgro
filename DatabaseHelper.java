package com.example.ruben.softwareengeneering20;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ruben on 27/02/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
        // If you change the database schema, you must increment the database version.

        public DatabaseHelper(Context context) {
            super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
        }
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(LandmarkDatabase.SQL_CREATE_ENTRIES);
        }
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            // This database is only a cache for online data, so its upgrade policy is
            // to simply to discard the data and start over
            db.execSQL(LandmarkDatabase.SQL_DELETE_ENTRIES);
            onCreate(db);
        }
        public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            onUpgrade(db, oldVersion, newVersion);
        }
}
// To acces database we need to have an instance, so DatabaseHelper mDbHelper = new DatabaseHelper(getContext());