package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.CareerThree;
import com.nfsysu.ems.entity.CareerTwo;

/**
 * ����ְҵDao�ӿ�
 * @author С��
 *
 */
public interface CareerThreeDao {
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
	
	/**
	 * ����twoid����ʵ��
	 * @param id
	 * @return
	 */
	public CareerTwo findByTwoId(Integer id);
}
