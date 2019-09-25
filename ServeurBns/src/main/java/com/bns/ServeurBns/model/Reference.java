package com.bns.ServeurBns.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="reference")


	
public class Reference implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
     @GeneratedValue
	 private int id ;
	 private String pay ;
	 private String institution ;	 
	 private String description;
	 private String logo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	@Override
	public String toString() {
		return "Reference [id=" + id + ", pay=" + pay + ", institution=" + institution + ", description=" + description
				+ ", logo=" + logo + "]";
	}

	 
	
}