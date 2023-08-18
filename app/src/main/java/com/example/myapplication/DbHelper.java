package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    SQLiteDatabase db;

    private static final String DATABASE_NAME="football.db";
    private static final int DATABASE_VERSION=1;

    private static final String TABLE_FOOTBALL="_football";

    private static final String KEY_ID="id";
    private static final String KEY_POS="Pos";
    private static final String KEY_NAME="Name";
    private static final String KEY_IMAGE="Image";
    private static final String KEY_MATCHP="MatchP";
    private static final String KEY_MATCHWON="MatchWon";
    private static final String KEY_MATCHDRAWN="MatchDrawn";
    private static final String KEY_MATCHLOST="MatchLost";
    private static final String KEY_GOALSF="GoalsF";
    private static final String KEY_GOALSA="GoalsA";

    public DbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void OnCreate(SQLiteDatabase db){
        String Query_Table="CREATE TABLE " +TABLE_FOOTBALL+ "("
                +KEY_ID+ "INTEGER PRIMARY KEY AUTOINCREMENT, "
                +KEY_POS+ " INTEGER, " +KEY_IMAGE+ " INTEGER, " +KEY_NAME+ " TEXT, " +KEY_MATCHP+ " TEXT, "
                +KEY_MATCHWON+ "INTEGER, " +KEY_MATCHDRAWN+ "INTEGER, " +KEY_MATCHLOST+ "INTEGER, " +KEY_GOALSF+ "INTEGER, "
                +KEY_GOALSA+ "INTEGER);";
        db.execSQL(Query_Table);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_FOOTBALL);
        onCreate(db);
    }
}
