package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ֪ͨʵ��
 * @author С��
 *
 */
public class Notice {
	private Integer id;//���
	private User user;//����Ա
	private Date createTime;//����ʱ��
	private String title;//��Ŀ
	private String content;//����
	private Integer viewedNum;//�������
	private String summary;//ժҪ
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	public Integer getViewedNum() {
		return viewedNum;
	}
	public void setViewedNum(Integer viewedNum) {
		this.viewedNum = viewedNum;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
