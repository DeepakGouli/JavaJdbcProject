package com.akhm.utils;

import java.sql.Date;

import com.akhm.dao.model.StudentTl;
import com.akhm.service.dto.StudentDTO;

public class FactoryUtils {
	
	private FactoryUtils()
	{
		
	}
	
	public  static StudentTl convertStudentDTOToStudentTl(StudentDTO studentDTO)
	{
		StudentTl studentTl=null;
		if(studentDTO != null)
		{
			studentTl = new StudentTl();
			studentTl.setFirstName(studentDTO.getFirstName());;
			studentTl.setLastName(studentDTO.getLastName());
			studentTl.setEmailId(studentDTO.getEmailId());
			studentTl.setMobileNo(studentDTO.getMobileNo());
			studentTl.setPassword(studentDTO.getPassword());
			
			//studentTl.setDob(studentDTO.getDob());
			if(studentDTO.getDob() != null)
			{
				Date sdate = new Date(studentDTO.getDob().getTime());
			}
			
		}
		
		return studentTl;
		
	}
	
	public static StudentDTO convertStudentTlToStudentDTO(StudentTl studentTl)
	{
		StudentDTO studentDTO = null;
		
		if(studentTl != null) {
			studentDTO = new StudentDTO();
			studentDTO.setFirstName(studentTl.getFirstName());
			studentDTO.setLastName(studentTl.getLastName());
			studentDTO.setEmailId(studentTl.getEmailId());
			studentDTO.setMobileNo(studentTl.getMobileNo());
			studentDTO.setPassword(studentTl.getPassword());
			studentDTO.setDob(studentTl.getDob());
			
			
			
		}
		return studentDTO;
		
	}

}
