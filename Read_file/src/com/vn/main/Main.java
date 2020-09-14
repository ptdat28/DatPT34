package com.vn.main;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

import com.vn.entities.employee;

public class Main {
	public static void main(String[] args) {
		try {
			File f = new File("E:/EmPloyee.txt");
		    FileReader fr = new FileReader(f);
		    BufferedReader br = new BufferedReader(fr);
		    String line = null;
	    	System.out.println("Danh Sach nhan vien");
            System.out.println("         ");
		    while ((line = br.readLine()) != null){
				String[] CutString  = line.split(",");
	            employee empl = new employee();
	            if (CutString.length > 0) {
					empl.setId(Integer.parseInt(CutString[0]));
					empl.setName(CutString[1]);
					empl.setAge(Integer.parseInt(CutString[2]));
					empl.setSalary(Double.parseDouble(CutString[3]));
					empl.setBD(CutString[4]);
					String newBirthDay = empl.format(CutString[4]);
					empl.setBD(newBirthDay);
	                System.out.println("id: " + empl.getId());
	                System.out.println("Name: " + empl.getName());
	                System.out.println("Age: " + empl.getAge());
	                System.out.println("Salary: " + empl.getSalary());
	                System.out.println("BirthDay: " + empl.getBD());
	                System.out.println("       ");	
				}
		    }
		    fr.close();
			br.close();}
			catch (Exception e) {
				e.printStackTrace();
		
	}
}	

}
