package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cisc181.exception.*;


public abstract class Person implements java.io.Serializable {

	private Date DOB;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String address;
	private String phone_number;
	private String email_address;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String MiddleName) {
		this.MiddleName = MiddleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date DOB){
		this.DOB = DOB;
		
		
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhone(String newPhone_number) {
		phone_number = newPhone_number;
	
	}

	public String getPhone() {
		return phone_number;
	}

	public void setEmail(String newEmail) {
		email_address = newEmail;
	}

	public String getEmail() {
		return email_address;
	}


	public Person() {

	}


	public Person(String FirstName, String MiddleName, String LastName, Date DOB, 
			String Address, String Phone_number, String Email) throws PersonException
	{
		this.FirstName = FirstName;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.address = Address;
		this.email_address = Email;

		
		
		
		Calendar then = Calendar.getInstance();
		then.add(Calendar.YEAR, -100);
		if (DOB.compareTo(then.getTime()) < 0){
			System.out.println("uh i think youre dead.");
			throw new PersonException(this);
		}
		
		
		else 
			this.setDOB(DOB);
		
		String phoneregex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
		
		Pattern pattern = Pattern.compile(phoneregex);
		
		Matcher matcher = pattern.matcher(Phone_number);
		
		if (matcher.matches() == false){
			System.out.println("Thats a weird number please try again");
			throw new PersonException(this);
		}
		else 
			this.setPhone(Phone_number);
	}

	public void PrintName() {
		System.out.println(this.FirstName + ' ' + this.MiddleName + ' '
				+ this.LastName);
	}

	public void PrintDOB() {
		System.out.println(this.DOB);
	}

	public int PrintAge(){
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();

		int age = 0;
		birthDate.setTime(this.DOB);
		if (birthDate.after(today)) {
			throw new IllegalArgumentException("Can't be born in the future");
		}
		age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

		if ((birthDate.get(Calendar.DAY_OF_YEAR)
				- today.get(Calendar.DAY_OF_YEAR) > 3)
				|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
			age--;

		} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
				&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))) {
			age--;
		}

		System.out.println("age is " + age);

		return age;

	}
}