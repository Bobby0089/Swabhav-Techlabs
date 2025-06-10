package com.company.employee;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee(int employeeId, String name, double salary)
	{
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.employeeId, o.employeeId);
	}
	
	
	@Override
	public String toString() {
		return "\n Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "] \n";
	}

}
