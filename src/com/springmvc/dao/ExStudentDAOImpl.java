package com.springmvc.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entity.ExStudent;

@Repository//It tell DAO Implementation
public class ExStudentDAOImpl implements ExStudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<ExStudent> getStudent() {
		Session currentSession= sessionFactory.getCurrentSession();
		Query<ExStudent> theQuery= currentSession.createQuery("from ExStudent",ExStudent.class);
		List<ExStudent> students= theQuery.getResultList();
		return students;
	}
}
