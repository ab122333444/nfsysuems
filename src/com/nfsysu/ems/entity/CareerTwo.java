package com.nfsysu.ems.entity;

import java.util.List;

/**
 * ְҵʵ��
 * @author С��
 *
 */
public class CareerTwo {
	private Integer id;//���
	private String name;//ְҵ����
	private CareerOne careerOne;
	private List<CareerThree> careerThreeList;
	
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
	public List<CareerThree> getCareerThreeList() {
		return careerThreeList;
	}
	public void setCareerThreeList(List<CareerThree> careerThreeList) {
		this.careerThreeList = careerThreeList;
	}
	public CareerOne getCareerOne() {
		return careerOne;
	}
	public void setCareerOne(CareerOne careerOne) {
		this.careerOne = careerOne;
	}
}
