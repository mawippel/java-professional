package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

	private void oldWay() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		bufferedReader.readLine();
		System.out.println(bufferedReader);
	}
	
	// new way
	public static void main(String[] args) {
		java.io.Console console = System.console();
		if (console != null) { // null check, as it's possible to have an app without console interactions
			String readLine = console.readLine();
			console.writer().println(readLine);
		}
	}
	
}
