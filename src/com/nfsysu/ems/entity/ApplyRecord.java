package com.nfsysu.ems.entity;

import java.util.Date;

/**
 * ӦƸ��¼ʵ��
 * @author С��
 *
 */
public class ApplyRecord {
	private Integer id;//���
	private User user;//�û�
	private RecruitInfo recruitInfo;//��Ƹ��Ϣ
	private Integer isStore;//�Ƿ��ղ�
	private Date storeTime;//�ղ�ʱ��
	private Integer isApply;//�Ƿ�����
	private Date applyTime;//����ʱ��
	private Resume resume;//����Ͷ�ݵļ���
	private String applyState;//����״̬
	private Integer isInform;//�Ƿ�֪ͨ
	private Date informTime;//֪ͨʱ��
	private String informTopic;//֪ͨ����
	private String informContent;//֪ͨ����
	private String informState;//֪ͨ״̬
	private Integer isRefuse;//�Ƿ�ؾ�
	private Date interviewTime;//����ʱ��
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public RecruitInfo getRecruitInfo() {
		return recruitInfo;
	}
	public void setRecruitInfo(RecruitInfo recruitInfo) {
		this.recruitInfo = recruitInfo;
	}
	public Integer getIsStore() {
		return isStore;
	}
	public void setIsStore(Integer isStore) {
		this.isStore = isStore;
	}
	public Date getStoreTime() {
		return storeTime;
	}
	public void setStoreTime(Date storeTime) {
		this.storeTime = storeTime;
	}
	public Integer getIsApply() {
		return isApply;
	}
	public void setIsApply(Integer isApply) {
		this.isApply = isApply;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	public String getApplyState() {
		return applyState;
	}
	public void setApplyState(String applyState) {
		this.applyState = applyState;
	}
	public Integer getIsInform() {
		return isInform;
	}
	public void setIsInform(Integer isInform) {
		this.isInform = isInform;
	}
	public Date getInformTime() {
		return informTime;
	}
	public void setInformTime(Date informTime) {
		this.informTime = informTime;
	}
	public String getInformTopic() {
		return informTopic;
	}
	public void setInformTopic(String informTopic) {
		this.informTopic = informTopic;
	}
	public String getInformContent() {
		return informContent;
	}
	public void setInformContent(String informContent) {
		this.informContent = informContent;
	}
	public String getInformState() {
		return informState;
	}
	public void setInformState(String informState) {
		this.informState = informState;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getIsRefuse() {
		return isRefuse;
	}
	public void setIsRefuse(Integer isRefuse) {
		this.isRefuse = isRefuse;
	}
	public Date getInterviewTime() {
		return interviewTime;
	}
	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}
	
}
