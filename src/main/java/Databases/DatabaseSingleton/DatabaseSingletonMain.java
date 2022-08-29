package Databases.DatabaseSingleton;

public class DatabaseSingletonMain {

    public static void main(String[] args) {
        DatabaseSingleton database = DatabaseSingleton.getInstance();
        database.connect();
    }
}
