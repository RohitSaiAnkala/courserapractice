package com.demo;
import java.util.Scanner;
class Emp{
	private int empno;
	private String ename;
	private double salary;
	Emp(int empno,String ename,double salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	}
	Emp(){
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void helper() {
		int count=9999999;
		 int a[]=new int[count];
for(int i=0;i<count;i++) 
			a[i]=i;
	}
	
}
public class Lab3 {
public static void main(String[] args) {
		Emp e=new Emp();
		e.helper();
		Emp list[]=new Emp[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter details of employee "+(i+1));
			Emp emp=new Emp(sc.nextInt(),sc.next(),sc.nextDouble());
		    list[i]=emp;
		}
		for(int i=0;i<5;i++) {
			System.out.println("Details of Employee "+(i+1));
			System.out.println("EMPNO:"+list[i].getEmpno());
			System.out.println("EMPNAME:"+list[i].getEname());
			System.out.println("EMPSAL:"+list[i].getSalary());
		}
		e.helper();
	}
}
