package com.Springjdbc.dao;

import java.util.List;



import com.Sprignjdbc.Entity.Student;


public interface Jdbcoperationdao {
	
	public int add(Student std) ;
	public int change(Student std);
	public int remove(int id);
	public Student getrecord(int id);
	public List<Student> getalldata();
}
