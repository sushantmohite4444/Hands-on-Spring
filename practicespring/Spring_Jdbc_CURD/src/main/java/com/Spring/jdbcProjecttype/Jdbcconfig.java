package com.Spring.jdbcProjecttype;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Springjdbc.dao.Jdbcoperationdao;
import com.Springjdbc.dao.JdbcoperationdaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.Springjdbc.dao"})
public class Jdbcconfig {
	
	@Bean("jte")
	public JdbcTemplate gettemplet() {
		JdbcTemplate jte =new JdbcTemplate();
		jte.setDataSource(getsource());
		return jte;
	}
	
	
	public DataSource getsource() {
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dms.setUrl("jdbc:oracle:thin:@DESKTOP-067DG19:1521:XE");
		dms.setUsername("emp1");
		dms.setPassword("sush");
		return dms ;
	}
	
	
//	@Bean("impl")
//	public Jdbcoperationdao getimp() {
//		JdbcoperationdaoImpl impl= new JdbcoperationdaoImpl();
//		impl.setJt(gettemplet());
//		return impl;
//	}
	
	
}
//  Without annotation