package com.nfsysu.ems.entity;


/**
 * רҵʵ��
 * @author С��
 *
 */
public class Major {
	private Integer id;//���
	private String name;//רҵ��
	private Dep dep;//ϵ
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
	public Dep getDep() {
		return dep;
	}
	public void setDep(Dep dep) {
		this.dep = dep;
	}
	
	
}
