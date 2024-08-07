package in.scaler.lld1200624.lld2.singleton.eager;

public class DatabaseConnection {
    //eager
    private static final DatabaseConnection instance = new DatabaseConnection();
    private String url;
    private String username;
    private String password;

    // Make constructor private
    private DatabaseConnection() {

    }

    public static DatabaseConnection getInstance() {
        return instance;
    }
}