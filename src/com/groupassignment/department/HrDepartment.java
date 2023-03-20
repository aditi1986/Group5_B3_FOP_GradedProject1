package com.groupassignment.department;

/**
 * This is HR Department Class 
 * 
 * @author Aditi
 *
 */
public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return "Welcome to HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

}
