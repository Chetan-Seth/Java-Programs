
package com.Java_Programs;

import java.util.Scanner;

public class FlyodsTriangleProgram1{
//
//	/*
//	 * ---Flyods Triangle--- 1 2 3 4 5 6 7 8 9 10
//	 */
	public static void main(String[] args) {

		int n, i, j, k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of Rows");
		n = sc.nextInt();
		System.out.println("---Flyods Triangle---");

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;

			}
			System.out.println();
		}

	}

}
