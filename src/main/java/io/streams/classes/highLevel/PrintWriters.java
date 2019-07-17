package io.streams.classes.highLevel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Operates on Writer.
 * 
 * Writes data as characters.
 */
public class PrintWriters {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter("file.log");
		printWriter.write("aaa"); // accepts only chars or String
		printWriter.print("wooow"); // Accepts everything
		printWriter.println("aaaa");
		
		
		printWriter.print("aaa");
		printWriter.println("bbb");
		printWriter.format("wowo %s aa", "bbb"); // We could also pass a Locale to format here
		printWriter.format("gege");
		printWriter.println();
		
		/*
		 * This will output:
		 * aaabbb
		 * wowo bbb aagege
		 * 
		 */
	}
	
}
