package com.hcl.talmate.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demands")
public class Demand {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int demandId;

	private String primarySkill;
	private String secondarySkill;
	private Date startBydate;
	private float exp;
	private String location;
	private int count;
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getDemandId() {
		return demandId;
	}

	public void setDemandId(int demandId) {
		this.demandId = demandId;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public Date getStartBydate() {
		return startBydate;
	}

	public void setStartBydate(Date startBydate) {
		this.startBydate = startBydate;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Demand(int demandId, String primarySkill, String secondarySkill, Date startBydate, float exp,
			String location) {
		super();
		this.demandId = demandId;
		this.primarySkill = primarySkill;
		this.secondarySkill = secondarySkill;
		this.startBydate = startBydate;
		this.exp = exp;
		this.location = location;
	}

	public Demand() {
		super();
	}

}
