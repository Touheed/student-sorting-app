package com.tech.org.studentsorting.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tech.org.studentsorting.model.Student;
import com.tech.org.studentsorting.service.SortingService;

@Service("heap")
public class HeapSortService implements SortingService{
	private static final Logger lOGGER = LoggerFactory.getLogger(HeapSortService.class);

	 /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return A list of Student objects representing all bubble sorted.
     */
	@Override
	public List<Student> sort(List<Student> students) {
		lOGGER.info("heap invoked");
		return heapSort(students);
	}
	
	  /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return A list of Student objects representing all bubble sorted.
     */
	private List<Student> heapSort(List<Student> students) {
		lOGGER.info("Start : heapSort invoked");
        int n = students.size();

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(students, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Swap root (maximum element) with the last element
            Student temp = students.get(0);
            students.set(0, students.get(i));
            students.set(i, temp);

            // Call max heapify on the reduced heap
            heapify(students, i, 0);
        }
        lOGGER.info("End : heapSort invoked");
        return students;
    }

    private static void heapify(List<Student> students, int n, int i) {
    	lOGGER.info("Start : heapify invoked");
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && students.get(left).getGrade() > students.get(largest).getGrade()) {
            largest = left;
        }

        if (right < n && students.get(right).getGrade() > students.get(largest).getGrade()) {
            largest = right;
        }

        if (largest != i) {
            // Swap students.get(i) and students.get(largest)
            Student temp = students.get(i);
            students.set(i, students.get(largest));
            students.set(largest, temp);

            lOGGER.debug("Student"+students.toString());
            // Recursively heapify the affected sub-tree
            heapify(students, n, largest);
        }
        lOGGER.info("End : heapify invoked");
    }


}
