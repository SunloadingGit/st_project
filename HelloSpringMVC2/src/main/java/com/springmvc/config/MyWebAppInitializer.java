package com.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//Spring IOC��������
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// ���Է���Spring��Java�����ļ�����
		return new Class<?>[]{};
	}

	//DispatcherServlet��URLӳ���ϵ����
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{ WebConfig.class };
	}

	//DispatcherServlet��������
	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"*.do"};
	}

}
