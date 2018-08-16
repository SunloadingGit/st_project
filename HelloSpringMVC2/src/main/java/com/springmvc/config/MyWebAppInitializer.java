package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//Spring IOC容器配置
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// 可以返回Spring的Java配置文件数组
		return new Class<?>[]{};
	}

	//DispatcherServlet的URL映射关系配置
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{ WebConfig.class };
	}

	//DispatcherServlet拦截内容
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"*.do"};
	}

}
