package com.sts.dao;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;

import com.sts.Employee;
import com.sts.jdbc.ConnectionFactory;


public class EmployeeDAO {
	
	public int insert(Employee emp) throws SQLException {
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, emp.getEmpNo());
		pStatement.setString(2, emp.getEname());
		pStatement.setString(3, emp.getJob());
		pStatement.setInt(4, emp.getMgr());
		pStatement.setDate(5, emp.getHiredate());
		pStatement.setDouble(6, emp.getSal());
		pStatement.setDouble(7, emp.getComm());
		pStatement.setInt(8, emp.getDeptNo());
		int output=pStatement.executeUpdate();
		return output;
		
	}
	public int delete(int empNo)throws Exception {
		Connection conn=ConnectionFactory.getConnection();
		String sql="delete from emp  where empno=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1,empNo);
		int x=ps.executeUpdate();
		return x;
		
		
		
	}
	public int update(int empNo,String empName)throws Exception {
		Connection conn=ConnectionFactory.getConnection();
		String sql="update emp set ename=? where empno=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,empName);
		ps.setInt(2,empNo);
		int x=ps.executeUpdate();
		return x;
		
		
		
	}
	public Employee read(int empNo) throws SQLException {
		String query="select * from emp where empNo= ?";
		Employee emp=null;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			emp=new Employee();
			emp.setEname(resultSet.getString("ename"));
		}
		return emp;
	}
	public static void main(String[] args) {
		try {
			//System.out.println(new EmployeeDAO().insert(new Employee(1000, "aaaa", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			System.out.println(new EmployeeDAO().read(1000));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
