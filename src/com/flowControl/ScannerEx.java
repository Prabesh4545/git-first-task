package com.flowControl;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student No;");
		int sno=sc.nextInt();

		System.out.println("Enter Student's Name:");
		String sname=sc.next();
		
		System.out.println("Enter Student's Cell No:");
		long No=sc.nextLong();
		
		System.out.println("Enter fee");
		double fee=sc.nextDouble();
		
		System.out.println("Student's Info:");
		System.out.println(sno+"\t"+sname+"\t"+No+"\t"+fee);



	}

}
