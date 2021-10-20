package connection;

public class ConnectionPostgreSQL implements IConnection {

    private String host;
    private String port;
    private String username;
    private String password;

    public ConnectionPostgreSQL() {
        this.host = "localhost";
        this.port = "5433";
        this.username = "postgres";
        this.password = "123";
    }

    @Override
    public void connect() {
        System.out.println("Se conecto a PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Se desconecto de PostgreSQL");
    }

    @Override
    public String toString() {
        return "ConnectionPostgreSQL [host=" + host + ", port=" + port + ", username=" + username + ", password="
                + password + "]";
    }
}
