package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ��Ƹ��Ϣʵ��
 * @author С��
 *
 */
public class RecruitInfo {
	private Integer id;//���
	private User user;//
	private String state;//���״̬
	private Date refreshDate;//ˢ��ʱ��
	private String name;//ְλ����
	private String city;//��
	private String nature;//ְλ����
	private CareerThree careerThree;//����ְλ����
	private String recruitNum;//��Ƹ����
	private String salary;//н�ʴ���
	private String welfare;//��������
	private String sex;//�Ա�Ҫ��
	private String degree;//ѧ��Ҫ��
	private String workExp;//��������
	private String description;//ְλ����
	private String linkman;//��ϵ��
	private String tel;//�̶��绰
	private String phone;//��ϵ�ֻ�
	private String email;//��ϵ����
	private Integer viewedNum;//�������
	private String resumeNum;//ӦƸ������
	private String linkAddress;//��ϵ��ַ
	private Date createDate;//����ʱ��
	private Date checkedDate;//���ʱ��
	private String province;//ʡ 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getRefreshDate() {
		return refreshDate;
	}
	public void setRefreshDate(Date refreshDate) {
		this.refreshDate = refreshDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getRecruitNum() {
		return recruitNum;
	}
	public void setRecruitNum(String recruitNum) {
		this.recruitNum = recruitNum;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getWelfare() {
		return welfare;
	}
	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getWorkExp() {
		return workExp;
	}
	public void setWorkExp(String workExp) {
		this.workExp = workExp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getViewedNum() {
		return viewedNum;
	}
	public void setViewedNum(Integer viewedNum) {
		this.viewedNum = viewedNum;
	}
	public String getResumeNum() {
		return resumeNum;
	}
	public void setResumeNum(String resumeNum) {
		this.resumeNum = resumeNum;
	}
	public String getLinkAddress() {
		return linkAddress;
	}
	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCheckedDate() {
		return checkedDate;
	}
	public void setCheckedDate(Date checkedDate) {
		this.checkedDate = checkedDate;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public CareerThree getCareerThree() {
		return careerThree;
	}
	public void setCareerThree(CareerThree careerThree) {
		this.careerThree = careerThree;
	}
}
