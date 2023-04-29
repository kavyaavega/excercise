package com.avega.training.ems.excercises.pojo;

import java.util.Objects;

public class Project {
	
private int  projectId;
	
private String projectName;
	
private String projectHead;

private int noOfResources;

public Project(int projectId, String projectName, String projectHead, int noOfResources) {
	super();
	this.projectId = projectId;
	this.projectName = projectName;
	this.projectHead = projectHead;
	this.noOfResources = noOfResources;
}

public Project() {

}


public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public String getProjectHead() {
	return projectHead;
}

public void setProjectHead(String projectHead) {
	this.projectHead = projectHead;
}

public int getNoOfResources() {
	return noOfResources;
}

public void setNoOfResources(int noOfResources) {
	this.noOfResources = noOfResources;
}

@Override
public String toString() {
	return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectHead=" + projectHead
			+ ", noOfResources=" + noOfResources + "]";
}

@Override
public int hashCode() {
	return Objects.hash(noOfResources, projectHead, projectId, projectName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Project other = (Project) obj;
	return noOfResources == other.noOfResources && Objects.equals(projectHead, other.projectHead)
			&& projectId == other.projectId && Objects.equals(projectName, other.projectName);
}



}
