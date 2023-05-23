package com.avega.training.java.daopattern.employeeexample.serviceImpl;

import java.util.List;

import com.avega.training.employeeexample.dao.SkillsDao;
import com.avega.training.employeeexample.daoImpl.SkillsDaoImpl;
import com.avega.training.java.daopattern.employeeexample.exception.SkillNotFoundException;
import com.avega.training.java.daopattern.employeeexample.pojo.Skill;
import com.avega.training.java.daopattern.employeeexample.service.SkillService;

public class SkillServiceImpl implements SkillService{
	
	SkillsDao dao=null;
	
	public SkillServiceImpl() {
		this.dao=new SkillsDaoImpl();
	}

	@Override
	public List<Skill> findAllskills() {
		return dao.getAllskills();
	}

	@Override
	public List<Skill> findSkillsByname(String name) {
		return dao.getSkillsByname(name);
	}

	@Override
	public Skill findSkillsByid(String skillid) {
		Skill skill = null;
		try {
			skill= dao.getSkillsByid(skillid);
		} catch (SkillNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return skill;
	}

	@Override
	public boolean createSkills(Skill skill) {
		return dao.addSkills(skill);
	}

	@Override
	public boolean removeSkills(Skill skill) {
		return dao.deleteSkills(skill);
	}

	@Override
	public Skill editSkills(Skill skill) {
		return dao.updateSkills(skill);
	}

}
