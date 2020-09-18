package com.vn.filepath;

import java.io.File;


public class filepath {
public static void main(String[] args) {
	File fileOrDir = new File("E:\\CreatFolder\\text");
	File[] txtFiles = fileOrDir.listFiles(new extxt());
    
	for (File txtFile : txtFiles) {
		System.out.println(txtFile.getAbsolutePath());
	}

}
}
	       
	

	





		
					
	




