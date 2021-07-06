package com.example.demo.ConfigDatabase;

public class MySqlDatabase extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("MySql connect to: " + getUrl());
    }
}
