package com.Springjdbc.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.Sprignjdbc.Entity.Student;

@Component("impl")
public class JdbcoperationdaoImpl implements Jdbcoperationdao{
	
	@Autowired
	 private JdbcTemplate jte;
	 
	public JdbcTemplate getjte() {
		
		return jte;
	}


	public void setjte(JdbcTemplate jte) {
		this.jte = jte;
	}
	
	public int add(Student std) {
		
		String query = "insert into student values(?,?,?) ";
		
		int i = jte.update(query, std.getId(),std.getName(),std.getLastname());
		
		return i;
	}

	
	public int change(Student std) {
		String query= "update Student set name=? , lastname=? where id=?";
		
		int i =jte.update(query,std.getName(),std.getLastname(),std.getId());		
		return i;
	}

	
	public int remove(int id) {
		
		String query ="delete student where id=?";
		int i=jte.update(query,id);
		return i;
	}

	
	
	public Student getrecord(int id) {
		
		String query= "select * from student where id=?";
		
		RowMapper<Student>  rowMapper = new Rowmapper();
		
	Student stud=	jte.queryForObject(query, rowMapper , id);
		
		return stud;
	}

	
	public List<Student> getalldata() {
		String query ="select * from student";
		List<Student> list =jte.query(query,new Rowmapper());
		return list;
	}
	
	
	
}
