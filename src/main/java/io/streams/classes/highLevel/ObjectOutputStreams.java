package io.streams.classes.highLevel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreams {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("doesntExists"));
		objectOutputStream.writeObject(new Animal(1L, "aa")); // If the Object is not Serializable, or an attribute of
																// it is not Serializable, it will throw a NotSerializableException
	}

	private static class Animal implements Serializable {

		private static final long serialVersionUID = -686922544247959357L;

		private Long id;
		private String name;

		public Animal(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

	}

}
