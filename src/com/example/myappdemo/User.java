package com.example.myappdemo;

import java.io.Serializable;

public class User implements Serializable {
    private int ID;
    private String UserName;    
    private String location;    
    private int price;
    
    public final void setID(int value)
    {
        ID = value;
    }
    public final int getID()
    {
        return ID;
    }    
    public final void setUserName(String value)
    {
        UserName = value;
    }
    public final String getUserName()
    {
        return UserName;
    }  
    public final void setLocation(String value)
    {
        location = value;
    }
    public final String getLocation()
    {
        return location;
    }  
    public final void setPrice(int value)
    {
        price = value;
    }
    public final int getPrice()
    {
        return price;
    }  
}