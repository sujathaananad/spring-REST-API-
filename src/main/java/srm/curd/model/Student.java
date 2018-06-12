package srm.curd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "student")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private String dob;
	@Column
	private String degree;
	@Column
	private String department;
	@Column
	private char grade;
	
	public Student() {
		super();
	}

	public Student(int id, String name, int age,String dob,String degree,String department,char grade) {
		super();
		this.id = id;
		this.name = name;
		this.age =age;
		this.dob = dob;
		this.degree = degree;
		this.department = department;
		this.grade = grade;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", degree=" + degree + ", department=" + department + ", grade=" + grade + "]";
	}

}
