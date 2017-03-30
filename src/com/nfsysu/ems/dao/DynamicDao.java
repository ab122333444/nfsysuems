package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.Dynamic;

/**
 * ��ҵ��̬Dao�ӿ�
 * @author С��
 *
 */
public interface DynamicDao {

	/**
	 * ��ѯ��ҵ��̬����
	 * @param map
	 * @return
	 */
	public List<Dynamic> find(Map<String,Object> map);

	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸���ҵ��̬
	 * @param dynamic
	 * @return
	 */
	public int update(Dynamic dynamic);
	
	/**
	 * �����ҵ��̬
	 * @param dynamic
	 * @return
	 */
	public int add(Dynamic dynamic);
	
	/**
	 * ɾ����ҵ��̬
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Dynamic findById(Integer id);
	
	/**
	 * ����UserId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<Dynamic> findByUserId(Integer id);

	/**
	 * ��ȡ��һ��
	 * @param id
	 * @return
	 */
	public Dynamic getLast(Integer id);
	
	/**
	 * ��ȡ��һ��
	 * @param id
	 * @return
	 */
	public Dynamic getNext(Integer id);
}
