package com.cisc181.core;
import java.util.Date;

import com.cisc181.exception.*;

public class Employee extends Person implements java.io.Serializable{
    private String office;
    private double salary;
    private Date hire;

    
    public Employee() {
    }

    public Employee(String FirstName, String MiddleName, String LastName,Date DOB,
			String Address, String Phone_number, String Email,
			String office, double salary, Date hire) throws PersonException
    {
    	super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
        this.office = office;
        this.salary = salary;
        this.hire = hire;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getOffice(){
        return this.office;
    }


    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setHire(Date hire){
        this.hire = hire;
    }

    public Date getHire(){
        return this.hire;
    }

}