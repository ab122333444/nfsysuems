package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ֤��ʵ��
 * @author С��
 *
 */
public class Certificate {
	private Integer id;//���
	private Date time;//��ȡʱ��
	private String name;//֤����
	private Resume resume;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	
}
