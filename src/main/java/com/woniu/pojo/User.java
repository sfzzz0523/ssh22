package com.woniu.pojo;
// Generated 2019-12-17 15:18:18 by Hibernate Tools 5.2.3.Final

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer uid;
	private String uname;
	private String upwd;

	public User() {
	}

	public User(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
