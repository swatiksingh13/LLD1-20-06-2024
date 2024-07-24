package in.scaler.lld1200624.lld2.singleton.lazy;

public class DatabaseConnection {
    //lazy
    private static DatabaseConnection instance;
    private String url;
    private String username;
    private String password;

    // Make constructor private
    private DatabaseConnection() {
    }
    //lazy
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}