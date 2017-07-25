package com.briup.cms.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
//	启动hibernate
	public static void main(String[] args){
		Configuration config=new Configuration();
		//读取
		config.configure();
		//建立Session工厂
		SessionFactory sessionFactory=config.buildSessionFactory();
		
	}
}
