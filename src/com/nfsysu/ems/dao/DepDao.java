package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.Dep;

/**
 * ϵDao�ӿ�
 * @author С��
 *
 */
public interface DepDao {
	/**
	 * ��ѯϵ����
	 * @param map
	 * @return
	 */
	public List<Dep> find(Map<String,Object> map);

	/**
	 * �޸�ϵ
	 * @param dep
	 * @return
	 */
	public int update(Dep dep);
	
	/**
	 * ���ϵ
	 * @param dep
	 * @return
	 */
	public int add(Dep dep);
	
	/**
	 * ɾ��ϵ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Dep findById(Integer id);
}
