package com.nfsysu.ems.service;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.RecAResAna;
import com.nfsysu.ems.entity.Resume;
/**
 * ����Service�ӿ�
 * @author С��
 *
 */
public interface ResumeService {
	/**
	 * ��ѯ��������
	 * @param map
	 * @return
	 */
	public List<Resume> find(Map<String,Object> map);
	
	public Map<String,Object> newData();
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * �޸ļ���
	 * @param resume
	 * @return
	 */
	public int update(Resume resume);
	
	/**
	 * ��Ӽ���
	 * @param resume
	 * @return
	 */
	public int add(Integer userId);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Resume findById(Integer id);

	/**
	 * ����userId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<Resume> findByUserId(Integer id);
	


	/**
	 * ��ѯ�����������-����ʱ��
	 * @return
	 */
	public List<RecAResAna> findGroupByCreateDate();

	/**
	 * ��ѯ�����������-��
	 * @return
	 */
	public List<RecAResAna> findGroupByCity();
	
	/**
	 * ��ѯ�����������-ʡ
	 * @return
	 */
	public List<RecAResAna> findGroupByProvince();

	/**
	 * ��ѯн�ʷ������
	 * @return
	 */
	public List<RecAResAna> findBySalary();

	/**
	 * ��ѯ�����������-ְҵone
	 * @return
	 */
	public List<RecAResAna> findGroupByTypeOne();


	/**
	 * ��ѯ�����������-ְҵtwo
	 * @return
	 */
	public List<RecAResAna> findGroupByTypeTwo();


	/**
	 * ��ѯ�����������-ְҵthree
	 * @return
	 */
	public List<RecAResAna> findGroupByTypeThree();
}
