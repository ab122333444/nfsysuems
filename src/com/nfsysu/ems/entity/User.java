package com.nfsysu.ems.entity;

import java.util.Date;
import java.util.List;


/**
 * �û�ʵ��
 * @author С��
 *
 */
public class User {
	private Integer id;//���
	private String userName;//�û���
	private String password;//����
	private Major major;//רҵ
	private String pic;//ͷ��/��ҵlogo 
	private String address;//��ַ
	private Date birthday;//��������
	private String email;//�����ʼ�
	private Date graduationYear;//��ҵ���
	private String trueName;//��ʵ����
	private String origin;//����
	private String politics;//������ò
	private String qq;//QQ
	private String salary;//�־�ҵ����
	private String sex;//�Ա�q
	private String status;//��ҵ���
	private String tel;//�̶��绰
	private String unit;//��ҵ��λ
	private Integer role;//0-ѧ����1-��ҵ��2-����Ա
	/*Ϊ�˸��õ��ں�̨�������Ա��������Ա������ݴ�role��������*/
	private Integer authority;//����Ա������ݣ�0-��������Ա��1-ϵ�߼�����Ա��2-ϵ��ͨ����Ա
	private CareerTwo careerTwo;//��ҵ_��ҵ/������ҵ
	private String introduction;//��ҵ_���
	private String url;//��ҵ_��ַ
	private Integer resumeNum;//ѧ��_������
	private String nature;//��ҵ_����
	private String scale;//��ҵ_��ģ
	private String linkman;//��ϵ��
	private String phone;//��ϵ�ֻ�
	private String lnglat;//��γ��
	private Dep dep;//רҵ
	private String province;//ʡ
	private String city;//��
	private List<Resume> resumeList;//��������-ѧ��
	private List<RecruitInfo> recruitInfoList;//��Ƹ��Ϣ����-��ҵ
	private List<Dynamic> dynamicList;//���ż���-��ҵ
	private List<Notice> noticeList;//֪ͨ����-����Ա
	public Integer getId() {
		return id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(Date graduationYear) {
		this.graduationYear = graduationYear;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getPolitics() {
		return politics;
	}
	public void setPolitics(String politics) {
		this.politics = politics;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public Integer getResumeNum() {
		return resumeNum;
	}
	public void setResumeNum(Integer resumeNum) {
		this.resumeNum = resumeNum;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLnglat() {
		return lnglat;
	}
	public void setLnglat(String lnglat) {
		this.lnglat = lnglat;
	}
	public Dep getDep() {
		return dep;
	}
	public void setDep(Dep dep) {
		this.dep = dep;
	}
	public List<Resume> getResumeList() {
		return resumeList;
	}
	public void setResumeList(List<Resume> resumeList) {
		this.resumeList = resumeList;
	}
	public List<RecruitInfo> getRecruitInfoList() {
		return recruitInfoList;
	}
	public void setRecruitInfoList(List<RecruitInfo> recruitInfoList) {
		this.recruitInfoList = recruitInfoList;
	}
	public List<Notice> getNoticeList() {
		return noticeList;
	}
	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	public List<Dynamic> getDynamicList() {
		return dynamicList;
	}
	public void setDynamicList(List<Dynamic> dynamicList) {
		this.dynamicList = dynamicList;
	}
	public Integer getAuthority() {
		return authority;
	}
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public CareerTwo getCareerTwo() {
		return careerTwo;
	}
	public void setCareerTwo(CareerTwo careerTwo) {
		this.careerTwo = careerTwo;
	}
}
