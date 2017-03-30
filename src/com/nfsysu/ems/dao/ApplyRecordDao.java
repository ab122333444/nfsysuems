package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.ApplyRecord;

/**
 * ӦƸ��¼Dao�ӿ�
 * @author С��
 *
 */
public interface ApplyRecordDao {
	/**
	 * ��ѯӦƸ��¼����
	 * @param map
	 * @return
	 */
	public List<ApplyRecord> find(Map<String,Object> map);

	/**
	 * �޸�ӦƸ��¼
	 * @param applyRecord
	 * @return
	 */
	public int update(ApplyRecord applyRecord);
	
	/**
	 * ���ӦƸ��¼
	 * @param applyRecord
	 * @return
	 */
	public int add(ApplyRecord applyRecord);
	
	/**
	 * ɾ��ӦƸ��¼
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public ApplyRecord findById(Integer id);
	
	/**
	 * ����UserId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<ApplyRecord> findByUserId(Integer id);

}
