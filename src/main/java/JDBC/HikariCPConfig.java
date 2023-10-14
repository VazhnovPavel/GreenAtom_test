package JDBC;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HikariCPConfig {
    public static HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("JDBC.properties")) {
            prop.load(input);
            config.setJdbcUrl(prop.getProperty("db.url"));
            config.setUsername(prop.getProperty("db.username"));
            config.setPassword(prop.getProperty("db.password"));
            config.setMaximumPoolSize(10); // Максимальное количество соединений в пуле
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return new HikariDataSource(config);
    }
}

