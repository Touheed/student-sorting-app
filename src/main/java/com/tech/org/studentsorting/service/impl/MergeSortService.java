package com.tech.org.studentsorting.service.impl;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tech.org.studentsorting.model.Student;
import com.tech.org.studentsorting.service.SortingService;

@Service("merge")
public class MergeSortService implements SortingService {

	private static final Logger lOGGER = LoggerFactory.getLogger(BubbleSortService.class);

	  /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return A list of Student objects representing all bubble sorted.
     */
	@Override
	public List<Student> sort(List<Student> students) {
		
		lOGGER.info("Start: merge invoked");
		//Merge Sort or TimSort. by Collections 
		Collections.sort(students);
		lOGGER.info("End: merge invoked");
		return students;
	}

}
