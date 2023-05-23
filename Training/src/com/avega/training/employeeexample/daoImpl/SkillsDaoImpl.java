package com.avega.training.employeeexample.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.avega.training.employeeexample.dao.SkillsDao;
import com.avega.training.java.daopattern.employeeexample.exception.SkillNotFoundException;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;

public class SkillsDaoImpl implements SkillsDao {
	ConcurrentHashMap<String,Skill> skills = new  ConcurrentHashMap<>();

	@Override
	public List<Skill> getAllskills() {
		return new ArrayList(skills.values());
	}

	@Override
	public List<Skill> getSkillsByname(String name) {
		List<Skill> skillList = new ArrayList<>();
		for(Skill skill:skills.values()) {
			if(skill.getSkillName().equalsIgnoreCase(name))
				skillList.add(skill);
		}
		return skillList;
	}

	@Override
	public Skill getSkillsByid(String skillid) throws SkillNotFoundException {
		Skill skill = null;
		for(Skill skillsfromlist:skills.values())
		{
			if(skillsfromlist.getSkillId().equalsIgnoreCase(skillid)) {
				skill=skillsfromlist;
				break;
			}
		}
		if(skill == null) {
			throw new SkillNotFoundException();
		}
		return skill;
	}

	@Override
	public boolean addSkills(Skill skill) {
		boolean flag= false;
		skills.put(skill.getSkillId(), skill);
		if(skills.get(skill.getSkillId())!= null) 
			flag= true;
			return flag;
	}

	@Override
	public boolean deleteSkills(Skill skill) {
		return skills.remove(skill.getSkillId(), skill);
	}

	@Override
	public Skill updateSkills(Skill skill) {
		Skill updateSkills = null;
		try {
			updateSkills = getSkillsByid(skill.getSkillId());
		} catch (SkillNotFoundException e) {
			e.printStackTrace();
		}
		updateSkills.setSkillName(skill.getSkillName());
		return updateSkills;
	}

}
