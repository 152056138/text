package com.briup.cms.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
//	����hibernate
	public static void main(String[] args){
		Configuration config=new Configuration();
		//��ȡ
		config.configure();
		//����Session����
		SessionFactory sessionFactory=config.buildSessionFactory();
		
	}
}
