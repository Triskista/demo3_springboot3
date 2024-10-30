package vn.iostar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import vn.iostar.configs.MySiteMeshFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Spingboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Spingboot3Application.class, args);
	}
	@Bean
	public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter(){
		FilterRegistrationBean<MySiteMeshFilter> registrationBean = new FilterRegistrationBean<MySiteMeshFilter>();
		registrationBean.setFilter(new MySiteMeshFilter());
		registrationBean.addUrlPatterns("/*");
				
		return registrationBean;
	}

}
