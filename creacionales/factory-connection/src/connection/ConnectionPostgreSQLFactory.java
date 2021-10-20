package connection;

public class ConnectionPostgreSQLFactory extends ConnectionFactory {

    @Override
    protected IConnection getConnection() {
        return new ConnectionPostgreSQL();
    }

}
