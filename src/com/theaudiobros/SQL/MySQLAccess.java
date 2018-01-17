package com.theaudiobros.SQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAccess {

    private Connection connection;
    private String host, database, username, password;
    private int port;
    private Statement statement;

    public void setCredentials(String Host, int Port, String Database, String Username, String Password) {
        host = Host;
        port = Port;
        database = Database;
        username = Username;
        password = Password;
    }

    public void open() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return;
        }

        synchronized (this) {
            if (connection != null && !connection.isClosed()) {
                return;
            }
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + this.host+ ":" + this.port + "/" + this.database, this.username, this.password);
            statement = connection.createStatement();
        }
    }

    public List<String> getData(String FROM, String WHERE, String COLUMNLABEL) throws SQLException {
        ResultSet result = statement.executeQuery("SELECT * FROM " + FROM + " WHERE " + WHERE + " = 0;");
        List<String> data = new ArrayList<>();
        while (result.next()) {
            String temp = result.getString(COLUMNLABEL);
            data.add(temp);
        }
        return data;
    }

}
