package com.potatomeme.myhometrainingroutine.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.potatomeme.myhometrainingroutine.entity.Action;


@Database(entities = {Action.class},exportSchema = false, version = 1)
public abstract class ActionDataBase extends RoomDatabase {
    public abstract ActionDataBase actionRepository();
}
