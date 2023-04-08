package com.flowControl;

public class ZeroOrNot {
	
	void zero() {
		int a=10;
		if(a<0)
			System.out.println("The Number is Less Than Zero");
		else
			System.out.println("The Number is More Than Zero");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroOrNot z= new ZeroOrNot();
		z.zero();

	}

}
