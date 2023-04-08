package com.flowControl;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		if(age>=18)
		{
			int weight=45;
			if(weight>=45)
				System.out.println("He/She can give the Blood");
			else
				System.out.println("He/She is Underweight!");
			
			
			
		}
		else
		{
			System.out.println("He/She is Minor!");
		}

	}

}
