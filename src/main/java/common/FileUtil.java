package common;

import java.io.File;
import java.io.FilenameFilter;

public class FileUtil {

	public static void getFileList() {
		String path = ".";

		File dirFile = new File(path);
		File[] fileList = dirFile.listFiles();

		for (File file : fileList) {
			if (file.isFile()) {
				String tempPath = file.getParent();
				String tempFileName = file.getName();

				System.out.println("Path=" + tempPath);
				System.out.println("FileName=" + tempFileName);
			}
		}
	}

	public static void getFilteredFileList() {
		String path = ".";

		File dirFile = new File(path);
		FilenameFilter filter = new FileFilter(".xml");
		File[] fileList = dirFile.listFiles(filter);

		for (File file : fileList) {
			if (file.isFile()) {
				String tempPath = file.getParent();
				String tempFileName = file.getName();

				System.out.println("Path=" + tempPath);
				System.out.println("FileName=" + tempFileName);
			}
		}
	}

	public static void main(String[] args) {
		getFileList();
		getFilteredFileList();
	}
}
