package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.Major;

/**
 * רҵDao�ӿ�
 * @author С��
 *
 */
public interface MajorDao {
	/**
	 * ��ѯרҵ����
	 * @param map
	 * @return
	 */
	public List<Major> find(Map<String,Object> map);

	/**
	 * �޸�רҵ
	 * @param major
	 * @return
	 */
	public int update(Major major);
	
	/**
	 * ���רҵ
	 * @param major
	 * @return
	 */
	public int add(Major major);
	
	/**
	 * ɾ��רҵ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Major findById(Integer id);
	
	/**
	 * ����depId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<Major> findByDepId(Integer id);
}
