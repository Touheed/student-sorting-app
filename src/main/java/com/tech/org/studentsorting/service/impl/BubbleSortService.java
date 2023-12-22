package com.tech.org.studentsorting.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.tech.org.studentsorting.model.Student;
import com.tech.org.studentsorting.service.SortingService;

@Service("bubble")
@Primary
public class BubbleSortService implements SortingService {
	private static final Logger lOGGER = LoggerFactory.getLogger(BubbleSortService.class);

	  /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return A list of Student objects representing all bubble sorted.
     */
	@Override
	public List<Student> sort(List<Student> students) {
		lOGGER.info("Buble Sort invoked");
		return bubbleSort(students);
	}
	
	  /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return A list of Student objects representing all bubble sorted.
     */
	private List<Student> bubbleSort(List<Student> students) {
		lOGGER.info("Start: bubbleSort");
        int n = students.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            lOGGER.debug("swapped:"+swapped);
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).getGrade() > students.get(j + 1).getGrade()) {
                    // swap students.get(j) and students.get(j+1)
                    Student temp = students.get(j);
                    lOGGER.debug("temp:"+temp);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                    lOGGER.debug("students:"+students);
                    swapped = true;
                   
                }
            }

            // If no two elements were swapped by inner loop, then the list is already sorted
            if (!swapped) {
                break;
            }
        }
        lOGGER.info("End: bubbleSort");
        return students;
    }

}
