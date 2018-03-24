package com.cisc181.core;

import java.util.UUID;

public class Course extends Semester{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	public Course(){
		
	}
	
	public Course( UUID courseID, String courseName, int gradePoints) {
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
	}
	
	public UUID getCourseID() {
		return CourseID;
	}

	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
}
