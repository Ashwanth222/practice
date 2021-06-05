package com.complaintmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.complaintmanagement.model.Complaint;
import com.complaintmanagement.service.ComplaintService;

@RestController
public class ComplaintController {
	@Autowired
	ComplaintService complaintService;

	@PostMapping(path = "/complaint/create")
	public Complaint createComplaint(@RequestBody Complaint complaint) {
		Complaint c = complaintService.createComplaint(complaint);
		return c;
	}

	@PutMapping(path = "/complaint/update")
	public Complaint updateComplaint(@RequestBody Complaint complaint) {
       Complaint c =  complaintService.updateComplaint(complaint);		
        return c;
	}
	@DeleteMapping(path = "/complaint/{complaintId}")
	public String deleteComplaintById(@PathVariable long complaintId) {
		 complaintService.deleteComplaintById(complaintId);
		return "sucessfullydeleted";
		}
	@GetMapping(path = "/complaint/{complaintId}")
	public Complaint getComplaintById(@PathVariable long complaintId) {
		Complaint complaint = new Complaint();
		complaint.setName("vamshi");
		complaint.setPhone(569866098769l);
		complaint.setLocation("hydrabad");
		complaint.setIssueDescription("go to yo0u village");
		return complaint;
	}
	@GetMapping(path = "/complaint/getAll")
	public List<Complaint> getComplaints(){
	List<Complaint> complaints = new ArrayList<Complaint>();
	
		Complaint complaint1 = new Complaint();
		complaint1.setName("rajez1");
		complaint1.setPhone(1976539006794l);
		complaint1.setLocation("hyd1");
		complaint1.setIssueDescription("having hyd1");
		
		Complaint complaint2 = new Complaint();
		complaint2.setName("rajez2");
		complaint2.setPhone(2976539006794l);
		complaint2.setLocation("hyd2");
		complaint2.setIssueDescription("having hyd2");
		
		return complaints;
		
	}
}  

//String name;
//long phone;
//String location;
//String issueDescription;

        
        
        
        
        


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        