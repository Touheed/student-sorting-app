package com.tech.org.studentsorting.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tech.org.studentsorting.model.Student;
import com.tech.org.studentsorting.request.StudentSortRQ;
import com.tech.org.studentsorting.service.DynamicServiceLoader;
import com.tech.org.studentsorting.service.SortingService;

@Controller
public class StudentController {

	private static final Logger lOGGER = LoggerFactory.getLogger(StudentController.class);

	private final DynamicServiceLoader dynamicServiceLoader;

	public StudentController(DynamicServiceLoader dynamicServiceLoader) {
		this.dynamicServiceLoader = dynamicServiceLoader;
	}

	@Autowired
	private SortingService sortingService;

	@RequestMapping("/")
	public String index() {
		lOGGER.info("Index page load");
		return "index";
	}

	@GetMapping("/healthCheck")
	@ResponseBody
	public String helathCheck() {
		lOGGER.info("Index page load");
		return "Service is up and running";
	}

	@PostMapping("/sort")
	@ResponseBody
	public String sortData(@RequestBody String requestData) {
		long startTime = System.currentTimeMillis();

		lOGGER.info("Start: SortData invoked");

		lOGGER.info("sortData invoked");
		String response = null;
		String jsonString = requestData.toString();
		lOGGER.info("jsonString:" + jsonString);

		ObjectMapper objectMapper = new ObjectMapper();
		try {
			// Convert JSON string to MyData object
			StudentSortRQ studentSortRQ = objectMapper.readValue(jsonString, StudentSortRQ.class);
			SortingService sortingService = dynamicServiceLoader.loadService(studentSortRQ.getAlgorithm());
			List<Student> studentsSorted = studentsSorted = sortingService.sort(studentSortRQ.getStudents());
			response = objectMapper.writeValueAsString(studentsSorted);

		} catch (Exception e) {
			e.printStackTrace();
		}
		long sortingTime = System.currentTimeMillis() - startTime;
		lOGGER.info("End: SortData invoked: Time taken" + sortingTime);

		return response;
	}

}
