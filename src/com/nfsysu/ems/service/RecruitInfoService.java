package com.nfsysu.ems.service;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.RecAResAna;
import com.nfsysu.ems.entity.RecruitInfo;
/**
 * ��Ƹ��ϢService�ӿ�
 * @author С��
 *
 */
public interface RecruitInfoService {
	/**
	 * ��ѯ��Ƹ��Ϣ����
	 * @param map
	 * @return
	 */
	public List<RecruitInfo> find(Map<String,Object> map);

	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * �޸���Ƹ��Ϣ
	 * @param recruitInfo
	 * @return
	 */
	public int update(RecruitInfo recruitInfo);
	
	/**
	 * �����Ƹ��Ϣ
	 * @param recruitInfo
	 * @return
	 */
	public int add(RecruitInfo recruitInfo);
	
	/**
	 * ɾ����Ƹ��Ϣ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public RecruitInfo findById(Integer id);
	
	/**
	 * ����UserId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<RecruitInfo> findByUserId(Integer id);

	/**
	 * ��ѯ��Ƹ��Ϣ�������-����ʱ��
	 * @return
	 */
	public List<RecAResAna> findGroupByCreateDate();

	/**
	 * ��ѯ��Ƹ��Ϣ�������-��
	 * @return
	 */
	public List<RecAResAna> findGroupByCity();
	
	/**
	 * ��ѯ��Ƹ��Ϣ�������-ʡ
	 * @return
	 */
	public List<RecAResAna> findGroupByProvince();

	/**
	 * ��ѯн�ʷ������
	 * @return
	 */
	public List<RecAResAna> findBySalary();

	/**
	 * ��ѯ��Ƹ��Ϣ�������-ְҵone
	 * @return
	 */
	public List<RecAResAna> findGroupByTypeOne();


	/**
	 * ��ѯ��Ƹ��Ϣ�������-ְҵtwo
	 * @return
	 */
	public List<RecAResAna> findGroupByTypeTwo();


	/**
	 * ��ѯ��Ƹ��Ϣ�������-ְҵthree
	 * @return
	 */
	public List<RecAResAna> findGroupByTypeThree();

	/**
	 * ��ȡ��һ��
	 * @param id
	 * @return
	 */
	public RecruitInfo getLast(Integer id);
	
	/**
	 * ��ȡ��һ��
	 * @param id
	 * @return
	 */
	public RecruitInfo getNext(Integer id);
}
