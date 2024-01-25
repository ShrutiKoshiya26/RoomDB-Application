package com.dbroom.roomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dbroom.roomapp.databinding.ActivityMainBinding;
import com.dbroom.roomapp.roomdb.ContactModel;
import com.dbroom.roomapp.roomdb.RoomDBHelper;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        //insert data to contactDB
        RoomDBHelper roomDBHelper = RoomDBHelper.getDatabase(this);
        roomDBHelper.contactDao().insertContact(new ContactModel("shruti", 9998887776L));

    }
}
