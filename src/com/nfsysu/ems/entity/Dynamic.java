package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ��ҵ��̬ʵ��
 * @author С��
 *
 */
public class Dynamic {
	private Integer id;//���
	private String title;//��ʼʱ��
	private String content;//����ʱ��
	private Date time;//����ʱ��
	private String state;//״̬      
	private User user;
	private Integer viewedNum;//�������
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getViewedNum() {
		return viewedNum;
	}
	public void setViewedNum(Integer viewedNum) {
		this.viewedNum = viewedNum;
	}
	
}
