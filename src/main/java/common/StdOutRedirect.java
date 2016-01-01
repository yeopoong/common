package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StdOutRedirect {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("log.txt");
		PrintStream printStream = new PrintStream(new FileOutputStream(file));

		System.out.println("Hello World!");
		System.err.println("ERROR!");

		PrintStream sysout = System.out;

		System.setOut(printStream);
		System.setErr(printStream);

		System.out.println("Hello World!");
		System.err.println("ERROR!");

		System.setOut(sysout);

		System.out.println("Hello World!");
		System.err.println("ERROR!");

		printStream.close();
	}
}
