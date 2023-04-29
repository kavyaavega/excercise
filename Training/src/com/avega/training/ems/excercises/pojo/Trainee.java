package com.avega.training.ems.excercises.pojo;

import java.util.ArrayList;
import java.util.List;

public class Trainee {
private int traineeId;

private String traineeName;

private String contactNo;

private String email;

private String gender;

private int age;


public Trainee(int traineeId, String traineeName, String contactNo, String email, String gender, int age) {
	super();
	this.traineeId = traineeId;
	this.traineeName = traineeName;
	this.contactNo = contactNo;
	this.email = email;
	this.gender = gender;
	this.age = age;
}


public Trainee() {
	super();
	// TODO Auto-generated constructor stub
}







/**
 * @return the traineeId
 */
public int getTraineeId() {
	return traineeId;
}





/**
 * @param traineeId the traineeId to set
 */
public void setTraineeId(int traineeId) {
	this.traineeId = traineeId;
}





/**
 * @return the traineeName
 */
public String getTraineeName() {
	return traineeName;
}





/**
 * @param traineeName the traineeName to set
 */
public void setTraineeName(String traineeName) {
	this.traineeName = traineeName;
}





/**
 * @return the contactNo
 */
public String getContactNo() {
	return contactNo;
}





/**
 * @param contactNo the contactNo to set
 */
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}





/**
 * @return the email
 */
public String getEmail() {
	return email;
}





/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}





/**
 * @return the gender
 */
public String getGender() {
	return gender;
}





/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}





/**
 * @return the age
 */
public int getAge() {
	return age;
}





/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}


@Override
public String toString() {
	return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", contactNo=" + contactNo + ", email="
			+ email + ", gender=" + gender + ", age=" + age + "]";
}





}
