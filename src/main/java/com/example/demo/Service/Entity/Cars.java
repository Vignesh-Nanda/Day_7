package com.example.demo.Service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cars")
public class Cars {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="CarName")
	private String cn;
	@Column(name="CarType")
	private String ct;
	@Column(name="Owners")
	private int own;
	@Column(name="CurrentOwnerName")
	private String con;
	@Column(name="Mobile")
	private long mob;
	@Column(name="Address")
	private String add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getCt() {
		return ct;
	}
	public void setCt(String ct) {
		this.ct = ct;
	}
	public int getOwn() {
		return own;
	}
	public void setOwn(int own) {
		this.own = own;
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Cars(int id, String cn, String ct, int own, String con, long mob, String add) {
		super();
		this.id = id;
		this.cn = cn;
		this.ct = ct;
		this.own = own;
		this.con = con;
		this.mob = mob;
		this.add = add;
	}

	public Cars() {}
}
