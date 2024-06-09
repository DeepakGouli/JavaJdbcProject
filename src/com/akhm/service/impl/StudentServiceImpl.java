package com.akhm.service.impl;

import com.akhm.dao.StudentDAO;
import com.akhm.dao.impl.StudentDAOImpl;
import com.akhm.dao.model.StudentTl;
import com.akhm.service.StudentService;
import com.akhm.service.dto.StudentDTO;
import com.akhm.utils.FactoryUtils;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO studentDAO;
	
	public StudentServiceImpl()
	{
		this.studentDAO = new StudentDAOImpl();
		
	}

	@Override
	public Integer saveStudent(StudentDTO studentDTO) {
		Integer studentId = null;
		try {
			if(studentDTO != null)
			{
				StudentTl studentTl = FactoryUtils.convertStudentDTOToStudentTl(studentDTO);
				if(studentTl != null)
				{
					studentId =  studentDAO.insertStudent(studentTl);
				}
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return studentId;
	}

}
