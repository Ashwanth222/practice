package com.complaintmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaintmanagement.dao.ComplaintDAO;
import com.complaintmanagement.model.Complaint;

@Service
public class ComplaintService{
	
	@Autowired
	ComplaintDAO complaintDao;
	
	public Complaint createComplaint(Complaint complaint) {
	Complaint c = complaintDao.createComplaint(complaint);
	return c;
	}
	
	public Complaint updateComplaint(Complaint complaint ) {
	Complaint c = complaintDao.updateComplaint(complaint);
	return c;
	}
	
	public String deleteComplaintById(long complaintId) {
		 Complaint c = complaintDao.deleteComplaintById(complaintId);
		return "sucessfullydeleted";
	}
	
	/*public Complaint getComplaintById() {
		Complaint c = complaintDao.getComplaintById(complaintId);
		return c;
	}*/
}