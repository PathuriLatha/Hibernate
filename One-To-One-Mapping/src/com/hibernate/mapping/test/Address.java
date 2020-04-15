package com.hibernate.mapping.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	

	public void setAddressId(int addressId){
		this.addressId = addressId;
	}
	public int getAddressId(){
		return  addressId;
	}
	public void setCity(String city){
		this.city = city;
	}
	public String getCity(){
		return  city;
	}
	public void setState(String state){
		this.state = state;
	}
	public String getState(){
		return  state;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public String getCountry(){
		return  country;
	}
	
	
	//toString
	public String toString(){
		return "[addressId="+addressId+", city="+city+", state="+state+", country="+country+"]";
	}
}
