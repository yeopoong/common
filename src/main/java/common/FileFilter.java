package common;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {

	private String extention;

	public FileFilter(String extention){ 
	        this.extention = extention; 
	    }

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(extention);
	}
}
