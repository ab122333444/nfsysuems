package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ����/ʵϰ����ʵ��
 * @author С��
 *
 */
public class WorkExp {
	private Integer id;//���
	private Date start;//��ʼʱ��
	private Date end;//����ʱ��
	private String unitName;//��λ��
	private String unitNature;//��λ����      
	private String unitIndustry;//��λ��ҵ
	private String unitScale;//��λ��ģ
	private String jobName;//ְλ����
	private String jobDept;//ְλ����
	private String jobType;//ְλ����
	private String salary;//����
	private String jobDescription;//����/ʵϰ����
	private Resume resume;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public String getUnitNature() {
		return unitNature;
	}
	public void setUnitNature(String unitNature) {
		this.unitNature = unitNature;
	}
	public String getUnitIndustry() {
		return unitIndustry;
	}
	public void setUnitIndustry(String unitIndustry) {
		this.unitIndustry = unitIndustry;
	}
	public String getUnitScale() {
		return unitScale;
	}
	public void setUnitScale(String unitScale) {
		this.unitScale = unitScale;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobDept() {
		return jobDept;
	}
	public void setJobDept(String jobDept) {
		this.jobDept = jobDept;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	
}
