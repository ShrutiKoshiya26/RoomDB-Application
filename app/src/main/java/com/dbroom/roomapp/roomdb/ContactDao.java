package com.dbroom.roomapp.roomdb;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ContactDao {

    @Insert
    public void insertContact(ContactModel contactModel);

    @Update
    public void UpdateContact(ContactModel contactModel);

    @Delete
    public void deleteContact(ContactModel contactModel);

    @Query("Select * from contactTB")
    public LiveData<List<ContactModel>> getAllContact();
}
