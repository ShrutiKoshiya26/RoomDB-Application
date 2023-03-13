package com.dbroom.roomapp.roomdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "contactTB")
public class ContactModel {

    @PrimaryKey(autoGenerate = true)
    int id;

    public ContactModel(String contactName, double contactNo) {
        this.contactName = contactName;
        this.contactNo = contactNo;
    }


    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public double getContactNo() {
        return contactNo;
    }

    public void setContactNo(double contactNo) {
        this.contactNo = contactNo;
    }

    @ColumnInfo(name = "contactName")
    String contactName;
    @ColumnInfo(name = "contactNo")
    double contactNo;
}
