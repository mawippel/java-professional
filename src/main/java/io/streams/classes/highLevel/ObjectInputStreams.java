package io.streams.classes.highLevel;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreams {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("doesntExists"));
		try {
			Object readObject = objectInputStream.readObject(); // Gotta explicitly cast the object
		} catch (EOFException e) { // Best way to identify the end of the file
			// reached the end of the file
		}
	}
	
	/**
	 * About serialization and deserialization process:
	 * 
	 * 1. It will call the no-arg constructor of the first parent class that is not Serializable;
	 * 2. It won't call the Class's constructor;
	 * 3. Static variables are ignored;
	 * 4. Default initializations are ignored;
	 */
	
}
