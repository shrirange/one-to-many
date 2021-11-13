package com.example.onetomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Awards implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "awardId")
	private Integer awardId;
	
	@Column(name = "awardName" , length = 1000)
	private String awardName;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="authorId" , nullable = false)
	private Author author;
		
	public Integer getAwardId() {
		return awardId;
	}

	public void setAwardId(Integer awardId) {
		this.awardId = awardId;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	

}
