package Databases.DatabaseFactory;

public class DatabaseTest {
    public static void main(String[] args) {
        Database database = DatabaseFactory.connect("localhost");
        Database database2 = DatabaseFactory.connect("localhost2");
    }
}

