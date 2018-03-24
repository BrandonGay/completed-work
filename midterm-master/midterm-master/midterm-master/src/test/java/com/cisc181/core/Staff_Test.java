package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
import com.cisc181.exception.*;

public class Staff_Test {
	
	@BeforeClass
	public static void setup() {	}
	
	@Test
	public void test1() {

		    Date a1 = new Date(8/12/2000);
		    Date a2 = new Date(8/02/1995);
			ArrayList<Staff> StaffList = new ArrayList<Staff>();
			
			
			Staff s1 = new Staff("Thaila", "Joane", "Rose", a1, "82 friendship highway", "1800000000", "email1@aol.com", "MF 1-3", 100, 400000, a2, eTitle.MS);
			Staff s2 = new Staff("Thomas", "Earl", "Gay", a1, "17 left road", "111-222-3333", "email2@gmail.com", "MF 10-5", 12, 600000, a2, eTitle.MR);
			Staff s3 = new Staff("Kerstie", "Marie", "Cini", a1, "234 sunnyvale lane", "5555555555", "email3@geocities.com", "TTR 10-11", 1, 800000, a2, eTitle.MRS);
			Staff s4 = new Staff("Brandon", "Thomas", "Gay", a1, "590 gravel highway", "8000000000", "bgay@udel.edu", "WF 10-12", 101, 1000000, a2, eTitle.MR);
			Staff s5 = new Staff("Alex", "Kathyrn", "Gay", a1, "180 boulevard dreams", "(282) 444-4444", "horses@winstead.com", "MWF 8-10", 181, 1200000, a2, eTitle.MS);
			
			StaffList.add(s1);
			StaffList.add(s2);
			StaffList.add(s3);
			StaffList.add(s4);
			StaffList.add(s5);		

		double AverageSalary = (s1.getSalary() + s2.getSalary() + s3.getSalary() + s4.getSalary() + s5.getSalary()) / 5;
			
		assertEquals(AverageSalary,800000,0);
	}
}