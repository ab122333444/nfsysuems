package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.User;

/**
 * �û�Dao�ӿ�
 * @author С��
 *
 */
public interface UserDao {
	public int register(User user);

	/**
	 * ��ȡ��¼���û�
	 * @param user
	 * @return
	 */
	public User login(User user);
	
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

	public User existNum(User user);
	
}
