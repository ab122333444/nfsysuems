package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.CareerOne;

/**
 * һ��ְҵDao�ӿ�
 * @author С��
 *
 */
public interface CareerOneDao {
	/**
	 * ��ѯְλ����
	 * @param map
	 * @return
	 */
	public List<CareerOne> find(Map<String,Object> map);
	
	public List<CareerOne> findWithTwo(Map<String,Object> map);
	
	public List<CareerOne> findWithTwoAndThree(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸�ְλ
	 * @param careerOne
	 * @return
	 */
	public int update(CareerOne careerOne);
	
	/**
	 * ���ְλ
	 * @param careerOne
	 * @return
	 */
	public int add(CareerOne careerOne);
	
	/**
	 * ɾ��ְλ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public CareerOne findById(Integer id);
	
	public CareerOne findByIdWithTwo(Integer id);
}
