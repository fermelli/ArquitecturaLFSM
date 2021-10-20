package connection;

public class ConnectionMySQL implements IConnection {

    private String host;
    private String port;
    private String username;
    private String password;

    public ConnectionMySQL() {
        this.host = "localhost";
        this.port = "3306";
        this.username = "root";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Se desconecto de MySQL");
    }

    @Override
    public String toString() {
        return "ConnectionMySQL [host=" + host + ", port=" + port + ", username=" + username + ", password=" + password
                + "]";
    }
}