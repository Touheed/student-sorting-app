package com.tech.org.studentsorting.service;

import java.util.List;

import com.tech.org.studentsorting.model.Student;

public interface SortingService {
	  List<Student> sort(List<Student> students);
}
