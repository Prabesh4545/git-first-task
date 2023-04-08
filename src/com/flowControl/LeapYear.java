package com.flowControl;

public class LeapYear {
	void leapYear()
	{
		int year=2020;
		if (year%4==0&&year%400==0)
			System.out.println("Given year is Leap Year");
		else
			System.out.println("Given year is Beep Year");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear ly= new LeapYear();
		ly.leapYear();

	}

}
