package com.projectboard.domain.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectboard.domain.service.ProjectTaskService;



@RestController
@RequestMapping("api/board")
@CrossOrigin
public class ProjectTaskController {
	
	
	@Autowired
	private ProjectTaskService projectTaskService ;	
	
	
}
