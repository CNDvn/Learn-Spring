package cnd.vn.demo.databaseconfig;

public class MySqlConnector extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("MySQL is connecting to: " + super.getUrl());
    }
}
