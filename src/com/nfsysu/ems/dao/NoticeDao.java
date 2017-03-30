package com.nfsysu.ems.dao;

import java.util.List;
import java.util.Map;

import com.nfsysu.ems.entity.Notice;

/**
 * ֪ͨDao�ӿ�
 * @author С��
 *
 */
public interface NoticeDao {
	/**
	 * ��ѯ֪ͨ����
	 * @param map
	 * @return
	 */
	public List<Notice> find(Map<String,Object> map);

	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * �޸�֪ͨ
	 * @param notice
	 * @return
	 */
	public int update(Notice notice);
	
	/**
	 * ���֪ͨ
	 * @param notice
	 * @return
	 */
	public int add(Notice notice);
	
	/**
	 * ɾ��֪ͨ
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ����id����ʵ��
	 * @param id
	 * @return
	 */
	public Notice findById(Integer id);

	/**
	 * ��ȡ��һ��
	 * @param id
	 * @return
	 */
	public Notice getLast(Integer id);
	
	/**
	 * ��ȡ��һ��
	 * @param id
	 * @return
	 */
	public Notice getNext(Integer id);
}
