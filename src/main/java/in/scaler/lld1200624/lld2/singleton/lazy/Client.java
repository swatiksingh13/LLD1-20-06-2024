package in.scaler.lld1200624.lld2.singleton.lazy;

public class Client {
    public static void main(String[] args) {
        demoSingleton();
    }

    private static void demoSingleton() {
        //this will not work as
        //DatabaseConnection() has private access in in.scaler.lld1200624.lld2.singleton.DatabaseConnection
        //DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection3 = DatabaseConnection.getInstance();

        System.out.println("DEBUG");
    }
}