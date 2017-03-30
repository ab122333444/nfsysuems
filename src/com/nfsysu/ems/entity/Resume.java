package com.nfsysu.ems.entity;

import java.util.Date;
import java.util.List;

/**
 * ����ʵ��
 * @author С��
 *
 */
public class Resume {
	private Integer id;//���
	private String resumeName;//��������
	private String attachResume;//��������
	private Date refreshDate;//�޸ļ���ʱ��
	private Date createDate;//��������ʱ��
	private String evaluation;//��������
	private String attachWorks;//������Ʒ
	private String salary;//�ڴ�н��
	private String city;//�ڴ������ص�-��
	private String province;//�ڴ������ص�-ʡ
	private List<Certificate> certificateList;
	private List<Education> educationList;
	private List<ItemExp> itemexpList;
	private List<WorkExp> workexpList;
	private User user;
	private CareerThree careerThree;//����ְҵ����
	private Integer viewedNum;//�������
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAttachResume() {
		return attachResume;
	}
	public void setAttachResume(String attachResume) {
		this.attachResume = attachResume;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
	public String getAttachWorks() {
		return attachWorks;
	}
	public void setAttachWorks(String attachWorks) {
		this.attachWorks = attachWorks;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getResumeName() {
		return resumeName;
	}
	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public List<Certificate> getCertificateList() {
		return certificateList;
	}
	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}
	public List<Education> getEducationList() {
		return educationList;
	}
	public void setEducationList(List<Education> educationList) {
		this.educationList = educationList;
	}
	public List<ItemExp> getItemexpList() {
		return itemexpList;
	}
	public void setItemexpList(List<ItemExp> itemexpList) {
		this.itemexpList = itemexpList;
	}
	public List<WorkExp> getWorkexpList() {
		return workexpList;
	}
	public void setWorkexpList(List<WorkExp> workexpList) {
		this.workexpList = workexpList;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getRefreshDate() {
		return refreshDate;
	}
	public void setRefreshDate(Date refreshDate) {
		this.refreshDate = refreshDate;
	}
	public CareerThree getCareerThree() {
		return careerThree;
	}
	public void setCareerThree(CareerThree careerThree) {
		this.careerThree = careerThree;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Integer getViewedNum() {
		return viewedNum;
	}
	public void setViewedNum(Integer viewedNum) {
		this.viewedNum = viewedNum;
	}
	
}
