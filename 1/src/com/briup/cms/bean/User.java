package com.briup.cms.bean;


/**
 * 
 * �û���
 * ���������û���ʵ���������û���Ϣ��
 *qqqqqqqqqqqqqqq
 */
public class User {
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	private long id;
	private String username;
	private String password;
	private String gender; //�Ա�
	private String telephone;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
