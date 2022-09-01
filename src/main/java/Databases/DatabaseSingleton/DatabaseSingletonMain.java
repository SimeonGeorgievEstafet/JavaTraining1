package Databases.DatabaseSingleton;

public class DatabaseSingletonMain {

    public static void main(String[] args) {
//        Database database = Database.getInstance();
        DatabaseSingleton database = DatabaseSingleton.getInstance();
        database.connect();
    }
}
