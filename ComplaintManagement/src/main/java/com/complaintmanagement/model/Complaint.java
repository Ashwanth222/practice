package com.complaintmanagement.model;

public class Complaint {

String name;
long phone;
String location;
String issueDescription;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the phone
 */
public long getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(long phone) {
	this.phone = phone;
}
/**
 * @return the location
 */
public String getLocation() {
	return location;
}
/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}
/**
 * @return the issueDescription
 */
public String getIssueDescription() {
	return issueDescription;
}
/**
 * @param issueDescription the issueDescription to set
 */
public void setIssueDescription(String issueDescription) {
	this.issueDescription = issueDescription;
}
}
