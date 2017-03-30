package com.nfsysu.ems.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nfsysu.ems.entity.User;
import com.nfsysu.ems.service.UserService;

public class TestUser {
	Logger logger = Logger.getLogger("TestUser");
	UserService service = null;
	
	@Before
	public void init() {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:applicationContext.xml");
		UserService service = (UserService) context.getBean("userService");
		assertNotNull(service);
		this.service = service;
	}

	@Test
	public void testAddUser() {
		User user = new User();
		user.setUserName("selina");
		user.setPassword("123456");
		user.setRole(0);
		// ���������ʻ����뵽���ݿ���
		service.add(user);
		logger.debug("user id: " + user.getId());
		// �����ݿ��ȡ�ղŲ�����ʻ�
		User userFromDb = service.findById(26);
		assertNotNull(userFromDb);
		assertEquals(26, userFromDb.getId());
	}

}