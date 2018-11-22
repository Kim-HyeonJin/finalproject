package webproject.configuration.member;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfiguration {
	
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(
			DataSource dataSource, ApplicationContext applicationContext) throws IOException {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		[1] DB연결은 누가 합니까?
		bean.setDataSource(dataSource);
//		[2] mybatis 설정파일은 어디 있습니까?
		bean.setConfigLocation(applicationContext.getResource(
											"classpath:/webproject/mybatis/mybatis-config.xml"));
//		[3] SQL명령만 보관한 파일(mapper)은 어디 있습니까?
		bean.setMapperLocations(applicationContext.getResources(
											"classpath:/webproject/mybatis/mapper/*-mapper.xml"));
		
		return bean;
	}
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
		return template;
	}
}
