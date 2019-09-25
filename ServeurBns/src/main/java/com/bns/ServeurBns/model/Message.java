package com.bns.ServeurBns.model;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	 private int id ;
	 private String nom;
	 private String email;
	 private String message;
	 private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", nom=" + nom + ", email=" + email + ", message=" + message + ", date=" + date
				+ "]";
	}
	 
	 
	
	
	 
	
}