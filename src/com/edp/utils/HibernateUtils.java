package com.edp.utils;

import org.hibernate.Session;

/**
 * 
 * @author EdPeng
 * @version ����ʱ�� 2020��1��23������12:39:24
 * ��˵�� Hibernate������
 */

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static final Configuration cfg;
	public static final SessionFactory sf;

	static {
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
	}

	public static Session openSession() {
		return sf.openSession();
	}

	public static Session getCurrentSession() {
		return sf.getCurrentSession();
	}
}
