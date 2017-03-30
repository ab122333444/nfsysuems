package com.nfsysu.ems.dao;

import java.util.List;

import com.nfsysu.ems.entity.Education;

/**
 * ��������Dao�ӿ�
 * @author С��
 *
 */
public interface EducationDao {

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
