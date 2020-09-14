package com.vn.entities;



public class employee {
	public int id;
	public String Name;
	public int Age;
	public double Salary;
	public String BoD;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getBD() {
		return BoD;
	}
	public void setBD(String bD) {
		BoD = bD;
	}

	public String format(String string) {
	return string.replace('/', '-');
}
}