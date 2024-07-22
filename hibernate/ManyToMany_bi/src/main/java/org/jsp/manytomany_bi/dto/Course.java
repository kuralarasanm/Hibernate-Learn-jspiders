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
//public class Course {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	@Column(nullable = false)
//	private String subject;
//	@Column(nullable = false)
//	private int duration;
//	@Column(nullable = false)
//	private String trainer;
//	@ManyToMany(cascade = CascadeType.ALL)
//	private List<Student1> students;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getSubject() {
//		return subject;
//	}
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//	public int getDuration() {
//		return duration;
//	}
//	public void setDuration(int duration) {
//		this.duration = duration;
//	}
//	public String getTrainer() {
//		return trainer;
//	}
//	public void setTrainer(String trainer) {
//		this.trainer = trainer;
//	}
//	public List<Student1> getStudents() {
//		return students;
//	}
//	public void setStudents(List<Student1> students) {
//		this.students = students;
//	}
//	
//	
//}
