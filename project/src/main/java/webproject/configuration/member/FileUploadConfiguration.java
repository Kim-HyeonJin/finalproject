package webproject.configuration.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * 	Spring configuration file
 * 이 파일에 등록하여 xml에 등록한 것과 같은 효과를 발생시키자....
 */
@Configuration
public class FileUploadConfiguration {
//	<!-- 파일 업로드 관련 설정을 bean으로 등록(common-io, common-fileupload가 필요) -->
//    <bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
//    	<!-- 파일 업로드 옵션 지정 -->
//    	<property name="defaultEncoding" value="UTF-8"></property>
//    	<property name="maxUploadSize" value="10000000"></property>
//    	<property name="maxUploadSizePerFile" value="1000000"></property>
//    </bean>
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		resolver.setMaxUploadSize(100*1024*1024);
		resolver.setMaxUploadSizePerFile(10*1024*1024);
		return resolver;
	}
}











