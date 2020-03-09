package com.example.web;

import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectListService {

	@RequestMapping("/api/v1/projects")
	public List<Project> getProjects(@RequestParam(value = "jiraUrl", defaultValue = "")String jiraUrl){
		

		
		return null;
		
	}
	
	
}
