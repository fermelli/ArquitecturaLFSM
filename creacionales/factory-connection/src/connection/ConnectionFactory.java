package connection;

public abstract class ConnectionFactory {

    abstract protected IConnection getConnection();

    public void makeConnection() {
        IConnection connection = this.getConnection();
        connection.connect();
    }
}
