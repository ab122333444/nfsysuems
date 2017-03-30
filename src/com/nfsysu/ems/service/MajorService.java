package com.nfsysu.ems.service;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.Major;
/**
 * רҵService�ӿ�
 * @author С��
 *
 */
public interface MajorService {
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
	 * ����depId����ʵ��
	 * @param id
	 * @return
	 */
	public List<Major> findByDepId(Integer id);
}
