package GreenAtomTrainee.Lesson5;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPConfig {
    public static HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/testdb");
        config.setUsername("NikToRozeo");
        config.setPassword("13241324");
        config.setMaximumPoolSize(10); // Максимальное количество соединений в пуле
        return new HikariDataSource(config);
    }
}

