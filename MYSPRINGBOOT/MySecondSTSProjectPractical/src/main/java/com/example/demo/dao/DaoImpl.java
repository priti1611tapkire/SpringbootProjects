package com.example.demo.dao;

import java.util.List;

import org.hibernate.query.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class DaoImpl implements DaoI
{
@Autowired
SessionFactory sf;
	@Override
	public int saveData(Employee e) {
		// TODO Auto-generated method stub
		Session sessin=sf.openSession();
		int eid=(int) sessin.save(e);
		sessin.beginTransaction().commit();
		return eid;
	}
	
	public List<Employee> getAlldata(){
		Session session=sf.openSession();
		Query q=session.createQuery("From Employee");
		List<Employee> elist=q.getResultList();
		return elist;
	}
	
	public List<Employee> getAllData(String u, String p){
		Session session=sf.openSession();
		List<Employee> elist=null;
		if(u.equals("admin")&&p.equals("admin")) {
			return getAlldata();
		}
		else {
			Query<Employee> q=session.createQuery("From Employee where uname=:un AND pass=:ps");
			q.setParameter("un", u);
			q.setParameter("pa", p);
			elist=q.getResultList();
			return elist;
			
		}
	}

}
