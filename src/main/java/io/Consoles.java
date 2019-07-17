package io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class Consoles {

	private void oldWay() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		bufferedReader.readLine();
		System.out.println(bufferedReader);
	}
	
	// new way
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) { // null check, as it's possible to have an app without console interactions
			String readLine = console.readLine();
			console.writer().println(readLine);
		}
	}
	
	private void readerAndWriter() {
		Console console = System.console();
		if (console != null) {
			Reader reader = console.reader(); // Returns the same stream as System.in
			PrintWriter writer = console.writer(); // Returns the same stream as System.out
		}
	}
	
	private void format() {
		Console console = System.console();
		if (console != null) {
			console.format("aaa"); // output a string formatted, it doesn't have a Locale overloaded method
		}
	}
	
	private void printf() {
		// exactly the same of format()
	}
	
	private void flush() {
		// flush the buffer to write immediately
		// it's recommended flushing before using readLine or readPassword
	}
	
	private void readLine() {
		Console console = System.console();
		if (console != null) { // null check, as it's possible to have an app without console interactions
			console.readLine();
			console.readLine("aaaa %s", "xd"); //readLine which shows the text before the reading
		}
	}
	
	private void readPassword() {
		Console console = System.console();
		if (console != null) { // null check, as it's possible to have an app without console interactions
			char[] readPassword = console.readPassword();
			char[] readPassword2 = console.readPassword("asdas %s", "xd"); // readPassword which shows the text before the reading
		}
	}
	
}
