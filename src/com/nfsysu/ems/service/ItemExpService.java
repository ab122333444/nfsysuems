package com.nfsysu.ems.service;

import java.util.List;

import com.nfsysu.ems.entity.ItemExp;
/**
 * ��Ŀ����Service�ӿ�
 * @author С��
 *
 */
public interface ItemExpService {
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
