package SQL;

import java.sql.*;

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

    public void getData() throws SQLException {
        ResultSet result = statement.executeQuery("SELECT * FROM PlayerData WHERE BALANCE = 0;");
    }

}
