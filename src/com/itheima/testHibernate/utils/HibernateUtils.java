package com.itheima.testHibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate框架的工具类
 * @author Administrator
 */
public class HibernateUtils {
	
	// ctrl + shift + x
	private static final Configuration CONFIG;
	private static final SessionFactory FACTORY;
	
	// 编写静态代码块
	static{
		// 加载XML的配置文件
		CONFIG = new Configuration().configure();
		// 构造工厂
		FACTORY = CONFIG.buildSessionFactory();
	}
	
	/**
	 * 从工厂中获取Session对象
	 * @return
	 */
	public static Session getSession(){
		return FACTORY.openSession();
	}
	
}
