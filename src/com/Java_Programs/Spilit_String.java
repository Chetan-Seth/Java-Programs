
package com.Java_Programs;

public class Spilit_String {

	public static void main(String[] args) {

		String demo = "username: admin";// given String
		String[] After_Spilit_Array = demo.split(":"); // Spilt based on : and output stored in array

		System.out.println(After_Spilit_Array[0]); // Directly printing output
		System.out.println(After_Spilit_Array[1]);

		System.out.println("----------");
		// output printing using trim() to remove white spaces
		System.out.println(After_Spilit_Array[0].trim());// username
		System.out.println(After_Spilit_Array[1].trim());// admin

		System.out.println("----------");

		// Using For Each loop
		for (String e : After_Spilit_Array) {
			System.out.println(e.trim());
		}

	}

}
