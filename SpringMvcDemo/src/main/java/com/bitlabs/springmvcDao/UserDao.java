package com.bitlabs.springmvcDao;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bitlabs.springMvcModel.Userclass;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void Adduser(Userclass userclass) {
		this.hibernateTemplate.saveOrUpdate(userclass);
	}
	public List<Userclass> getAllUsers() {
		List<Userclass> list=new ArrayList();
	   list=this.hibernateTemplate.loadAll(Userclass.class);
		return list;
	}
	public Userclass getById(int id) {
		Userclass u=this.hibernateTemplate.get(Userclass.class,id);
		return u;
	}
	@Transactional
	public void delete(int id) {
		Userclass u=this.hibernateTemplate.get(Userclass.class,id);
		this.hibernateTemplate.delete(u);
	}

}
