package com;

import java.sql.SQLException;
import java.time.LocalDateTime;

import org.h2.tools.Server;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *   sql mysql 
 *      | - table 
 *      |-  row 
 *      |- query 
 *   
 *   H2 database 
 *    server 
 *      |- 
 *    
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Server webServer = Server.createWebServer(
                "-web", "-webPort", "8083"
        ).start();
    	
         Configuration configuration=new Configuration();
          configuration.configure("com/hibernate-cnf.xml");
          
          SessionFactory factory= configuration
        		  .buildSessionFactory();
          
           Address address=new Address();
           address.setCity("hyd");
           address.setStreet("Hitech_oraclePlace");
           address.setPinCode(12412);
          
           Employee employee =new Employee();
           employee.setName("abc");
           employee.setCompanyName("xyz");
           employee.setContactNumber("3413513");
           employee.setEmailId("abc@gmail.com");
           employee.setLoginTime(LocalDateTime.of(2026,10,14,9, 0));
           employee.setAddress(address);
           
           Session session=factory.openSession();
           Transaction transaction=session.beginTransaction();
           
           session.persist(employee);
           transaction.commit();
           session.close();
           System.out.println("session closed");
           
           
           
           
           
           
           
         
    }
}
