package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ��Ŀ����ʵ��
 * @author С��
 *
 */
public class ItemExp {
	private Integer id;//���
	private Date start;//��ʼʱ��
	private Date end;//����ʱ��
	private String itemName;//��Ŀ��
	private String description;//����
	private Resume resume;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	
}
