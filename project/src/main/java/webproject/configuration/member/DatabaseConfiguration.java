package webproject.configuration.member;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatabaseConfiguration {
	//오라클연결
	@Bean
	public DataSource dataSource(){
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
//		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUrl("jdbc:oracle:thin:@192.168.6.39:1521:xe");
//		source.setUsername("sw5");
//		source.setPassword("sw5");
		source.setUsername("homekang");
		source.setPassword("team4");
		source.setMaxTotal(20);
		source.setMaxIdle(10);
		source.setMaxWaitMillis(3000);
		return source;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		return template;
	}
	
}
