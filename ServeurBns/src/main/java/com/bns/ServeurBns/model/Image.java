package com.bns.ServeurBns.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
    public Long id;
	
	public String img;

	public Image(String s) {
		// TODO Auto-generated constructor stub
		
		this.img=s;
	}

	
	public Image() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", img=" + img + "]";
	}
	
   
}