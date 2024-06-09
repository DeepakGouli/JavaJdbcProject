package com.akhm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import com.akhm.controller.StudentController;
import com.akhm.service.dto.StudentDTO;
import com.akhm.utils.DateUtils;

public class StudentApplication {

	private static StudentController studentController;

	static {
		studentController = new StudentController();

	}

	public static void main(String[] args) {
		saveStudent();
		

	}

	public static void saveStudent() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("enter firstName");
			String firstName = br.readLine();
			System.out.println("enter lastName");
			String lastName = br.readLine();
			System.out.println("enter emailId");
			String emailId = br.readLine();
			System.out.println("enter mobileNo");
			String mobileNo = br.readLine();
			System.out.println("enter password");
			String password = br.readLine();
			System.out.println("enter dob");
			String dob = br.readLine();
			Date uDate = DateUtils.convertStringToDate(dob);
			StudentDTO studentDTO = new StudentDTO();

			studentDTO.setFirstName(firstName);
			studentDTO.setLastName(lastName);
			studentDTO.setEmailId(emailId);
			studentDTO.setMobileNo(mobileNo);
			studentDTO.setPassword(password);
			studentDTO.setDob(uDate);
			Integer studentId = studentController.insertStudent(studentDTO);
			if (studentId != null && studentId > 0) {
				System.out.println("Student Details Inserted Successfully");
			} else {
				System.out.println("Exception Occured During inserting StudentS Details");
			}

		} catch (IOException Ie) {
			Ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
