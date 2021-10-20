package main;

import connection.ConnectionMySQLFactory;
import connection.ConnectionFactory;

public class Simulator {

    public static void main(String[] args) {
        ConnectionFactory mySQLFactory = new ConnectionMySQLFactory();
        mySQLFactory.makeConnection();
    }
}
