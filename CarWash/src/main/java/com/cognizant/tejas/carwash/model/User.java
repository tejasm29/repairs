package com.cognizant.tejas.carwash.model;

public class User {

	private int uid;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String sex;
	private String contactNumber;
	private String category;
	private String address;
	private String userId;
	private String password;
	
	
	public int getUid() {
		return uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getSex() {
		return sex;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", sex="
				+ sex + ", contactNumber=" + contactNumber + ", category=" + category + ", address=" + address
				+ ", userId=" + userId + ", password=" + password + "]";
	}
	
	
	
	
	
	
	}
	
	

