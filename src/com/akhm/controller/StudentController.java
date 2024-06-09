package com.akhm.controller;

import com.akhm.service.StudentService;
import com.akhm.service.dto.StudentDTO;
import com.akhm.service.impl.StudentServiceImpl;

public class StudentController {
	
	private StudentService studentService;
	
	public StudentController()
	{
		this.studentService = new StudentServiceImpl();
		
	}
	public Integer insertStudent(StudentDTO studentDTO)
	{
		if(studentDTO != null)
		{
			return studentService.saveStudent(studentDTO);
		}
		return null;
		
	}
	
	

}
