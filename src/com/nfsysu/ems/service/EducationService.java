package com.nfsysu.ems.service;

import java.util.List;

import com.nfsysu.ems.entity.Education;
/**
 * ��������Service�ӿ�
 * @author С��
 *
 */
public interface EducationService {
	/**
	 * �޸Ľ�������
	 * @param education
	 * @return
	 */
	public int update(Education education);
	
	/**
	 * ��ӽ�������
	 * @param education
	 * @return
	 */
	public int add(Education education);
	
	/**
	 * ɾ����������
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Education findById(Integer id);
	
	/**
	 * ����ResumeId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<Education> findByResumeId(Integer id);
}
