package com.nfsysu.ems.service;

import java.util.List;

import com.nfsysu.ems.entity.WorkExp;
/**
 * ����/ʵϰ����Service�ӿ�
 * @author С��
 *
 */
public interface WorkExpService {
	/**
	 * �޸Ĺ���/ʵϰ����
	 * @param workExp
	 * @return
	 */
	public int update(WorkExp workExp);
	
	/**
	 * ��ӹ���/ʵϰ����
	 * @param workExp
	 * @return
	 */
	public int add(WorkExp workExp);
	
	/**
	 * ɾ������/ʵϰ����
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public WorkExp findById(Integer id);
	
	/**
	 * ����ResumeId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<WorkExp> findByResumeId(Integer id);
}
