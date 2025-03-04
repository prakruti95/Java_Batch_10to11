package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="address_data5")
public class Address 
{
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")
	
	@Column(name="a_id")
	int aid;
	
	@Column(name="a_address")
	String address;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToMany
	
	List<Person>personlist = new ArrayList<Person>();


	public List<Person> getPersonlist() {
		return personlist;
	}
	public void setPersonlist(List<Person> personlist) {
		this.personlist = personlist;
	}
	
	
	
}
