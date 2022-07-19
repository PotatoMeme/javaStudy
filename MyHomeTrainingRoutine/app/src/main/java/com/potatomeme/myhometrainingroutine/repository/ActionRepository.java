package com.potatomeme.myhometrainingroutine.repository;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.potatomeme.myhometrainingroutine.entity.Action;

import java.util.List;

@Dao
public interface ActionRepository {
    @Query("SELECT * FROM `action`")
    List<Action> findAll();

    @Query("SELECT * FROM `action` Where seq=:seq")
    Action findById(int seq);

    @Insert
    void insert(Action diary);

    @Delete
    void delete(Action diary);

    @Update
    void update(Action diary);
}
