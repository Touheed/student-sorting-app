package com.tech.org.studentsorting.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
    private double grade;
	
    @Override
    public int compareTo(Student other) {
        // Compare students based on grades merge sort
        return Double.compare(this.grade, other.grade);
    }
    
    @Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade)
				&& Objects.equals(name, other.name);
	}
	

	public Student() {
		super();
	}

	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
    
    
    
}
