package com;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.Transient;
import lombok.Data;

/*  
 *     
 *      
 *      20%    [ 80%] 
 *    
 */
@Entity
@Table(name = "Employee_value")
@Data
public class Employee {
//@Id means primary
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "employee_name")
	private String name;
	@Column(name = "cmp_name")
	private String companyName;
	@Transient
	private String emailId;
	@Transient
	private String contactNumber;
	@Column(name = "LoginZone")
	private LocalDateTime loginTime;
	@Column(name="emp_address")
	@Embedded
	private Address address;

}
