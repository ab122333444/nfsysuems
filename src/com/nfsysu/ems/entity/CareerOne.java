package com.nfsysu.ems.entity;

import java.util.List;

/**
 * һ��ְҵʵ��
 * @author С��
 *
 */
public class CareerOne {
	private Integer id;//���
	private String name;//ְҵ����
	private Integer orderNo;//����
	private List<CareerTwo> careerTwoList;
	
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
	public Integer getOrder() {
		return orderNo;
	}
	public void setOrder(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public List<CareerTwo> getCareerTwoList() {
		return careerTwoList;
	}
	public void setCareerTwoList(List<CareerTwo> careerTwoList) {
		this.careerTwoList = careerTwoList;
	}
}
