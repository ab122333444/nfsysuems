package com.nfsysu.ems.entity;


/**
 * ְҵʵ��
 * @author С��
 *
 */
public class CareerThree {
	private Integer id;//���
	private String name;//ְҵ����
	private CareerTwo careerTwo;
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
	public CareerTwo getCareerTwo() {
		return careerTwo;
	}
	public void setCareerTwo(CareerTwo careerTwo) {
		this.careerTwo = careerTwo;
	}
}
