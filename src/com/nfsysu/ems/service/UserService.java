package com.nfsysu.ems.service;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.User;

/**
 * �û�Service�ӿ�
 * @author С��
 *
 */
public interface UserService {
	
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	public boolean register(User user);
	
	/**
	 * ��ȡ��¼���û�
	 * @param user
	 * @return
	 */
	public User login(User user);
	
	/**
	 * �Ƿ���ڴ��û�
	 * @param user
	 * @return
	 */
	public boolean existNum(User user);
	
	/**
	 * ��ѯ�û�����
	 * @param map
	 * @return
	 */
	public List<User> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	public int update(User user);
	
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public int add(User user);
	
	/**
	 * ɾ���û�
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public User findById(Integer id);

	public User getByUserName(String userName);
}
