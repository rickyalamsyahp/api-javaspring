package com.example.springpj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// menandakan bahwa class ini sebagai entity dan table dengan nama user.
@Entity
@Table(name = "shooping")
public class Shooping {

	// membuat entity baru dengan nama id yang mempunyai properties sebagai primary dan auto_increment.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	// membuat entity baru dengan nama Name
	@Column(name = "Name")
	private String Name;
	
	// membuat entity baru dengan nama CreatedDate
	@Column(name = "CreatedDate")
	private String CreatedDate;
	
	
	
	// setter gettter
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getCreatedDate() {
		return CreatedDate;
	}

	public void setCreatedDate(String CreatedDate) {
		this.CreatedDate = CreatedDate;
	}


	
	
	
}
