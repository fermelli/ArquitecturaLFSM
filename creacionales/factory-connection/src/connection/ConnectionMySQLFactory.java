package connection;

public class ConnectionMySQLFactory extends ConnectionFactory {

    @Override
    protected IConnection getConnection() {
        return new ConnectionMySQL();
    }

}
