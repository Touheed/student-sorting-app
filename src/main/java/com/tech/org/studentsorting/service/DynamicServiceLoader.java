package com.tech.org.studentsorting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.tech.org.studentsorting.model.Student;
import com.tech.org.studentsorting.service.impl.BubbleSortService;
import com.tech.org.studentsorting.service.impl.HeapSortService;
import com.tech.org.studentsorting.service.impl.MergeSortService;

@Service
public class DynamicServiceLoader {

	private final ApplicationContext applicationContext;

	 /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return DynamicServiceLoader which dynamically load sort class.
     */
    @Autowired
    public DynamicServiceLoader(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * Retrieve a list of all Studess.
     * @author TOUHEED  
     * @return DynamicServiceLoader which dynamically load sort class.
     */
    public SortingService loadService(String serviceName) {
    	SortingService sortingService = null;
    	if(serviceName.equals("bubble")) {
    		sortingService =  (BubbleSortService) applicationContext.getBean(serviceName, BubbleSortService.class);
    	}else if(serviceName.equals("heap")) {
    		sortingService =  (HeapSortService) applicationContext.getBean(serviceName, HeapSortService.class);
    	}else {
    		sortingService =  (MergeSortService) applicationContext.getBean(serviceName, MergeSortService.class);
    	}
        return sortingService;
    }
}
