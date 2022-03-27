package com.ladla.dayCare.service;

import java.sql.SQLException;

import com.ladla.dayCare.dao.DayCareDAO;

public class DayCareService {

	public String saveKidDetails(int rollNo,String name) throws SQLException{
		
		DayCareDAO dao= new DayCareDAO();
		boolean res=dao.saveKidDetails(rollNo, name);
		if(res) {
			return "The kid data saved successfully";
		}else {
			return "There was problem to store kid data ";
		}
	}
}
