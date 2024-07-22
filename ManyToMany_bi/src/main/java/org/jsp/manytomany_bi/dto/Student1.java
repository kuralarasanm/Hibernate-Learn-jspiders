//package org.jsp.manytomany_bi.dto;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//
//@Entity
//public class Student1 {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	@Column(nullable = false)
//	private String name;
//	@Column(nullable = false)
//	private double perc;
//	@Column(nullable = false)
//	private int yop;
//	@ManyToMany(mappedBy = "students")
//	private List<Course> courses;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getPerc() {
//		return perc;
//	}
//	public void setPerc(double perc) {
//		this.perc = perc;
//	}
//	public int getYop() {
//		return yop;
//	}
//	public void setYop(int yop) {
//		this.yop = yop;
//	}
//	public List<Course> getCourses() {
//		return courses;
//	}
//	public void setCourses(List<Course> courses) {
//		this.courses = courses;
//	}
//	
//}
