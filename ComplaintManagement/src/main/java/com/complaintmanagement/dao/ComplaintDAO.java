package com.complaintmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.complaintmanagement.model.Complaint;

@Repository
public class ComplaintDAO {
	
	public Complaint createComplaint(Complaint complaint) {
		String INSERT_USERS_SQL = "INSERT INTO tbl_complaint"
				+ "  (name, phone, location, issuedescription) VALUES "
				+ " ('" + complaint.getName() + "'," + complaint.getPhone() + ",'"
				+ complaint.getLocation() + "','" + complaint.getIssueDescription() + "')";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/complaintdb", "root", "Admin123");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(INSERT_USERS_SQL);
			con.close();
		} catch (ClassNotFoundException e)

		{
			System.out.println(e);
		} catch (SQLException se) {
			System.out.println(se);
		}	

		return complaint;
	}
	public Complaint updateComplaint(Complaint complaint) {
		return complaint;
	}
	public Complaint deleteComplaintById(long complaintId) {
		return null;
	}
}


