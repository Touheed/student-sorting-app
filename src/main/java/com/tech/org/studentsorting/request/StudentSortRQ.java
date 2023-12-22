package com.tech.org.studentsorting.request;

import java.util.List;

import com.tech.org.studentsorting.model.Student;

/**
 * @author Touheed
 *
 */
public class StudentSortRQ {

	private String file;
	private String algorithm;
	private List<Student> students;
	
	
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "StudentSortRQ [file=" + file + ", algorithm=" + algorithm + ", students=" + students + "]";
	}
	public StudentSortRQ() {
		super();
	}
	public StudentSortRQ(String file, String algorithm, List<Student> students) {
		super();
		this.file = file;
		this.algorithm = algorithm;
		this.students = students;
	}

		 
}
