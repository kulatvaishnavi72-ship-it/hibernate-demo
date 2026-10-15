package com;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {

	@Column(name = "emp_stree", length = 20)
	private String street;
	@Column(name = "emp_city")
	private String city;
	@Column(name = "emp_pinCode", length = 6)
	private int pinCode;

}
