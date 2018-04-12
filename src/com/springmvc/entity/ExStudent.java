package com.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exstudent")
public class ExStudent {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="scourse")
	private String scourse;
	
	@Column(name="syoj")
	private int syoj;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public int getSyoj() {
		return syoj;
	}
	public void setSyoj(int syoj) {
		this.syoj = syoj;
	}
	@Override
	public String toString() {
		return "ExStudent [sid=" + sid + ", sname=" + sname + ", email=" + email + ", scourse=" + scourse + ", syoj="
				+ syoj + "]";
	}
	
	
}
