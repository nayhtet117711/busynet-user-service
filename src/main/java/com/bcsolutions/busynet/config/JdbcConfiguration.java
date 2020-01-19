package com.bcsolutions.busynet.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class JdbcConfiguration {

//	@Bean
//	public Connection cjdbc() throws SQLException {
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/iotprocessed","user125","root");
//		return conn;
//	}
	
	@Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/iotprocessed");
        dataSourceBuilder.username("user125");
        dataSourceBuilder.password("root");
        return dataSourceBuilder.build();
    }

}
