package Databases.DatabaseFactory;

public class DatabaseFactory {

    public static Database connect(String DatabaseConnection) {
        Database database = null;
        switch (DatabaseConnection) {
            case "localhost":
                database = new LocalhostDb();
                database.connect();
                break;
            case "localhost2":
                System.out.println("Localhost2 connection");
                break;
        }
        return database;
    }
}