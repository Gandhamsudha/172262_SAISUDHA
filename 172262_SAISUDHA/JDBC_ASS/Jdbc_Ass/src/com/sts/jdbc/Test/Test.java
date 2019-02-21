package com.sts.jdbc.Test;

import java.util.Calendar;

import com.sts.Employee;
import com.sts.dao.EmployeeDAO;

public class Test {

	public static void main(String args[]) {
	try {
		System.out.println(new EmployeeDAO().insert(new Employee(1007, "aaaa", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
		//System.out.println(new EmployeeDAO().read(1007));
		//System.out.println(new EmployeeDAO().delete(1007)+" row deleted successfully");
		//System.out.println(new EmployeeDAO().update(1007,"Sudha")+" row update successfully");
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
