package com.ead.eadcw;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {

    private static final String URL = "Database URL";
    private static final String USER = "Database Username";
    private static final String PASSWORD = "Database password";

    private static final int INITIAL_POOL_SIZE = 10;
    private static final int MAX_POOL_SIZE = 500;

    private final HikariDataSource dataSource;

    private ConnectionPool() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(URL);
        config.setUsername(USER);
        config.setPassword(PASSWORD);

        // HikariCP-specific configurations
        config.setMinimumIdle(INITIAL_POOL_SIZE);
        config.setMaximumPoolSize(MAX_POOL_SIZE);
        config.setIdleTimeout(60000); // 60 seconds
        config.setConnectionTimeout(30000); // 30 seconds
        config.setMaxLifetime(1800000); // 30 minutes
        config.setLeakDetectionThreshold(2000); // Detect connection leaks after 2 seconds
        config.setValidationTimeout(5000); // 5 seconds
        config.setPoolName("EADCW-Connection-Pool");

        // Optional: Test query to validate connections
        config.setConnectionTestQuery("SELECT 1");

        // Create the data source
        dataSource = new HikariDataSource(config);
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public void shutdown() {
        if (dataSource != null) {
            dataSource.close();
        }
    }

    public static ConnectionPool create() {
        return new ConnectionPool();
    }
}
