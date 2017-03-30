package com.nfsysu.ems.dao;

import java.util.List;

import com.nfsysu.ems.entity.ItemExp;

/**
 * ��Ŀ����Dao�ӿ�
 * @author С��
 *
 */
public interface ItemExpDao {

	/**
	 * �޸���Ŀ����
	 * @param itemExp
	 * @return
	 */
	public int update(ItemExp itemExp);
	
	/**
	 * �����Ŀ����
	 * @param itemExp
	 * @return
	 */
	public int add(ItemExp itemExp);
	
	/**
	 * ɾ����Ŀ����
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public ItemExp findById(Integer id);
	
	/**
	 * ����ResumeId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<ItemExp> findByResumeId(Integer id);
}
