package com.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//����ɨ��İ������ؿ�����
@ComponentScan("com.*")
//����Spring Web MVC
@EnableWebMvc
public class WebConfig {
	/***
	 * ������ͼ������
	 * @return��ͼ������
	 */
	@Bean(name="viewResolver")
	public InternalResourceViewResolver ViewResolverinitViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
