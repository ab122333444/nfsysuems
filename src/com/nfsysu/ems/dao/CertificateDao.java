package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.Certificate;

/**
 * ֤��Dao�ӿ�
 * @author С��
 *
 */
public interface CertificateDao {
	/**
	 * ��ѯ֤�鼯��
	 * @param map
	 * @return
	 */
	public List<Certificate> find(Map<String,Object> map);

	/**
	 * �޸�֤��
	 * @param certificate
	 * @return
	 */
	public int update(Certificate certificate);
	
	/**
	 * ���֤��
	 * @param certificate
	 * @return
	 */
	public int add(Certificate certificate);
	
	/**
	 * ɾ��֤��
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Certificate findById(Integer id);
	
	/**
	 * ����ResumeId���Ҽ���
	 * @param id
	 * @return
	 */
	public List<Certificate> findByResumeId(Integer id);
}
