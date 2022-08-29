package Databases.DatabaseFactory;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class LocalhostDb implements Database {
    @Override
    public void connect() {
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
        final String QUERY = "SELECT * FROM products_inventory";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("product_id: " + rs.getInt("product_id"));
                System.out.println(",product_name: " + rs.getString("product_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
