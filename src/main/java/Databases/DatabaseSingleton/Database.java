package Databases.DatabaseSingleton;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Database {

    private static Database instance = new Database();

    private Database() {
    }

    public static Database getInstance() {
        return instance;
    }

    public ResultSet executeQuery(String query) {
        Properties props = new Properties();
        String dbSettingsPropertyFile = "src/main/resources/config.properties";
        FileReader fReader = null;
        try {
            fReader = new FileReader(dbSettingsPropertyFile);
            props.load(fReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final String DB_URL = props.getProperty("db.conn.url");
        final String USER = props.getProperty("db.username");
        final String PASS = props.getProperty("db.password");
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }
}