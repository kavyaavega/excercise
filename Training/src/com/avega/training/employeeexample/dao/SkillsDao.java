package com.avega.training.employeeexample.dao;

import java.util.List;

import com.avega.training.java.daopattern.employeeexample.exception.SkillNotFoundException;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;


public interface SkillsDao {
	
	List<Skill> getAllskills();
	List<Skill> getSkillsByname(String name);
	Skill getSkillsByid(String skillid) throws SkillNotFoundException;
	boolean addSkills(Skill skill);
	boolean deleteSkills(Skill skill);
	Skill updateSkills(Skill skill);
	
	
}
