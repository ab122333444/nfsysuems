package com.nfsysu.ems.service;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.CareerThree;

/**
 * ����ְҵService�ӿ�
 * @author С��
 *
 */
public interface CareerThreeService {
	/**
	 * ��ѯְλ����
	 * @param map
	 * @return
	 */
	public List<CareerThree> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * �޸�ְλ
	 * @param careerThree
	 * @return
	 */
	public int update(CareerThree careerThree);
	
	/**
	 * ���ְλ
	 * @param careerThree
	 * @return
	 */
	public int add(CareerThree careerThree);
	
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
	public CareerThree findById(Integer id);
}
