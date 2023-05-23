package com.avega.training.java.daopattern.employeeexample.service;

import java.util.List;

import com.avega.training.java.daopattern.employeeexample.pojo.Skill;

public interface SkillService {
	
	List<Skill> findAllskills();
	List<Skill> findSkillsByname(String name);
	Skill findSkillsByid(String skillid);
	boolean createSkills(Skill skill);
	boolean removeSkills(Skill skill);
	Skill editSkills(Skill skill);

}
