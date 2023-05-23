package com.avega.training.java.daopattern.employeeexample.pojo;

import java.util.Objects;

public class Skill {
	private String skillId;
	private String skillName;
	
	public Skill(String skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSkillId() {
		return skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(skillId, skillName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		return Objects.equals(skillId, other.skillId) && Objects.equals(skillName, other.skillName);
	}
}
