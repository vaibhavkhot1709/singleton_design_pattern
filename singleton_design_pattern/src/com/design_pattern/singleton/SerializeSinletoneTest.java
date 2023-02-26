package com.design_pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeSinletoneTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializeSinletone ser = SerializeSinletone.getInstance();

		FileOutputStream fot = new FileOutputStream("File.ser");
		ObjectOutputStream out = new ObjectOutputStream(fot);
		out.writeObject(ser);
		out.close();

		FileInputStream fio = new FileInputStream("File.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fio);

		SerializeSinletone ser1 = (SerializeSinletone) inputStream.readObject();
		inputStream.close();

		System.out.println("\n SerializeSinletone : " + (ser1 == ser));

//		ans is false bcz deserialization alays give new instance so give readResolve () implementation in serilizable class
//		and ans comes true bcz jvm internaly write code for readResolver()

	}

}
