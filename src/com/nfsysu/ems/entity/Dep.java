package com.nfsysu.ems.entity;

import java.util.List;

/**
 * ϵʵ��
 * @author С��
 *
 */
public class Dep {
	private Integer id;//���
	private String name;//ϵ��
	private List<Major> majorList;//רҵ
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Major> getMajorList() {
		return majorList;
	}
	public void setMajorList(List<Major> majorList) {
		this.majorList = majorList;
	}
	
	
}
