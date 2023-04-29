package com.avega.training.ems.excercises.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Batch {
	
private String batchCode;

private String startDate;

private String endDate;

private Trainee[] trainees;

public Batch(String batchCode, String startDate, String endDate, Trainee[] trainees) {
	super();
	this.batchCode = batchCode;
	this.startDate = startDate;
	this.endDate = endDate;
	this.trainees = trainees;
}

/**
 * @return the batchCode
 */
public String getBatchCode() {
	return batchCode;
}

/**
 * @param batchCode the batchCode to set
 */
public void setBatchCode(String batchCode) {
	this.batchCode = batchCode;
}

/**
 * @return the startDate
 */
public String getStartDate() {
	return startDate;
}

/**
 * @param startDate the startDate to set
 */
public void setStartDate(String startDate) {
	this.startDate = startDate;
}

/**
 * @return the endDate
 */
public String getEndDate() {
	return endDate;
}

/**
 * @param endDate the endDate to set
 */
public void setEndDate(String endDate) {
	this.endDate = endDate;
}

/**
 * @return the trainees
 */
public Trainee[] getTrainees() {
	return trainees;
}

/**
 * @param trainees the trainees to set
 */
public void setTrainees(Trainee[] trainees) {
	this.trainees = trainees;
}

@Override
public String toString() {
	return "Batch [batchCode=" + batchCode + ", startDate=" + startDate + ", endDate=" + endDate + ", trainees="
			+ Arrays.toString(trainees) + "]";
}

public Trainee getTrainee(int traineeId) {
    for (Trainee trainee : trainees) {
        if (trainee.getTraineeId() == traineeId) {
            return trainee;
        }
    }
    return null;
}

public Trainee[] getTrainee(String gender) {
	//use array 
    List<Trainee> traineesWithGender = new ArrayList<>();
    for (Trainee trainee : trainees) {
        if (trainee.getGender().equalsIgnoreCase(gender)) {
            traineesWithGender.add(trainee);
        }
    }
    return traineesWithGender.toArray(new Trainee[0]);
}




}
