package com.lambda;

import java.util.Arrays;
import java.util.List;


public class Employee {
	private int empid;
	private String ename;
	private String dept;
	private double sal;
	
	public Employee(int empid, String ename, String dept,double sal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
	
		return "empid="+empid+",ename="+ename+",dept="+dept+",sal="+sal;
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Asha","sales",8000);
		Employee e2=new Employee(1,"Roshini","devlopment",10000);
		Employee e3=new Employee(1,"Nikki","HR",20000);
		
		List<Employee>elist=Arrays.asList(e1,e2,e3);
		
		elist.forEach(emp->{
			if(emp.getSal()>10000) {
		System.out.println(emp);
			
		}
		});
	}
}