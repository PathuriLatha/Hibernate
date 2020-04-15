package com.hibernate.mapping.test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column(name = "student_id")
	private int studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	public int getStudentId(){
		return  studentId;
	}
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	public String getStudentName(){
		return  studentName;
	}
	
	public void setAddress(Address address){
		this.address= address;
	}
	public Address getAddress(){
		return  address;
	}

	//toString
	public String toString(){
		return "[studentid="+studentId+", studentname="+studentName+", address="+address+"]";
	}
}
