package com.akhm.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.akhm.dao.StudentDAO;
import com.akhm.dao.model.StudentTl;
import com.akhm.utils.JdbcUtils;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public Integer insertStudent(StudentTl studentTl) {
		
		Integer StudentId = 0;
		PreparedStatement pst = null;
		try {
			String sql = "insert into student_tl (first_name,last_name,email_id,mobile_no,password,dob)values(?,?,?,?,?,?)";
			pst = JdbcUtils.getconnection().prepareStatement(sql);
			pst.setString(1, studentTl.getFirstName());
			pst.setString(2, studentTl.getLastName());
			pst.setString(3, studentTl.getEmailId());
			pst.setString(4, studentTl.getMobileNo());
			pst.setString(5, studentTl.getPassword());
			pst.setDate(6, studentTl.getDob());
			StudentId = pst.executeUpdate();
			
		} catch (SQLException sqle) {
			
		}
		catch (Exception e) {
			
		}
		finally {
			JdbcUtils.cloaseStatement(pst);
			
		}
		
		return StudentId;
	}

}
