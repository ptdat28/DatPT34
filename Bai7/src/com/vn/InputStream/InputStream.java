package com.vn.InputStream;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;

public class InputStream {
	public static void main(String args[]){    
        try{    
          FileInputStream file=new FileInputStream("E:\\testout.txt");    
          
          int i = 0;
          while((i=file.read()) != -1) {  
          System.out.print((char)i);    
          }
          file.close();    
        }
        catch (FileNotFoundException e) {
			System.out.println("File input khong ton tai");
			e.printStackTrace();}
        catch(Exception e){System.out.println(e);}    
       }    

}
