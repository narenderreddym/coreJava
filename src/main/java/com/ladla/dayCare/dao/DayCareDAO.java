package com.ladla.dayCare.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DayCareDAO {

	public boolean saveKidDetails(int rNo,String name) throws SQLException{

		
		DriverManager.registerDriver(new OracleDriver());
		Connection con= DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		PreparedStatement pstmt =con.prepareStatement("insert into kidsdetails values(?,?)");
		pstmt.setInt(1, rNo);
		pstmt.setString(2, name);
		boolean result = pstmt.execute();
		con.close();
		return result;
	}

}
