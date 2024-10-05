package com.Spring.jdbcProjecttype;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.Sprignjdbc.Entity.Student;
import com.Springjdbc.dao.JdbcoperationdaoImpl;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ac= new AnnotationConfigApplicationContext(Jdbcconfig.class);
      
      
     JdbcoperationdaoImpl ji = ac.getBean("impl",JdbcoperationdaoImpl.class );
     
     Student stud =new Student();
     stud.setId(1);
     stud.setName("sush king");
     stud.setLastname("mohite ");
     
//    int q= ji.add(stud);
//    System.out.println(q + " record inserted ");
    
//    int q= ji.change(stud);
//    System.out.println(q + " record updated ");
     
//       stud.setId(1);
//     int q = ji.remove(stud.getId());
//     System.out.println(q + " record deleted");
     
//       stud.setId(3);
//      Student q =  ji.getrecord(stud.getId());
//      System.out.println(q);
      
     List<Student> students =ji.getalldata();
     for (Student student : students) {
		System.out.println(student);
	}
    }
}
