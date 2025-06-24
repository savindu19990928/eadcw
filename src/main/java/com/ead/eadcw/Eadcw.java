package com.ead.eadcw;

import java.sql.Connection;
import java.sql.SQLException;

public class Eadcw {
    private static ConnectionPool connectionPool;

    public static void main(String[] args) {
        try {
            // Initialize the connection pool
            connectionPool = ConnectionPool.create();
            System.out.println("Connection pool initialized.");

            // Register a shutdown hook to release resources
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                connectionPool.shutdown();
                System.out.println("Connection pool shut down.");
            }));

            // Example usage
            try (Connection conn = connectionPool.getConnection()) {
                System.out.println("Database connection acquired.");
                // Launch your application
                LoginForm form = new LoginForm();
                form.show();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to initialize connection pool or acquire connection.");
        }
    }

    public static Connection getConnection() throws SQLException {
        return connectionPool.getConnection();
    }
}
