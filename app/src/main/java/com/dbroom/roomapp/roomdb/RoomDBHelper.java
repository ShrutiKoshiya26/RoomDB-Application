package com.dbroom.roomapp.roomdb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = ContactModel.class,version = 1,exportSchema = false )
public abstract class RoomDBHelper extends RoomDatabase {

    private static RoomDBHelper INSTANCE;

    public static RoomDBHelper getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RoomDBHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    RoomDBHelper.class, "RoomDB")
                            // Wipes and rebuilds instead of migrating
                            // if no Migration object.
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    public abstract ContactDao contactDao();



}
