package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.CareerTwo;

/**
 * ����ְҵDao�ӿ�
 * @author С��
 *
 */
public interface CareerTwoDao {
	/**
	 * ��ѯְλ����
	 * @param map
	 * @return
	 */
	public List<CareerTwo> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * �޸�ְλ
	 * @param careerTwo
	 * @return
	 */
	public int update(CareerTwo careerTwo);
	
	/**
	 * ���ְλ
	 * @param careerTwo
	 * @return
	 */
	public int add(CareerTwo careerTwo);
	
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
	public CareerTwo findById(Integer id);
	
	public CareerTwo findByIdWithThree(Integer id);
	
	/**
	 * ����oneid����ʵ��
	 * @param id
	 * @return
	 */
	public CareerTwo findByOneId(Integer id);
}
