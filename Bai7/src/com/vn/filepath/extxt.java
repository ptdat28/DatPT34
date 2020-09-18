package com.vn.filepath;

import java.io.File;
import java.io.FilenameFilter;

public class extxt implements FilenameFilter {

	private static final String text = "txt";

	@Override
	public boolean accept(File dir, String name) {
		if (name.endsWith(text)) {
			return true;	
		}
		return false;
	}

}
