package com.flowControl;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=30;
		String grade="";
		if(marks>=90)
			grade="A+";
		else if(marks<90 && marks>=80)
			grade="A";
		else if(marks<80 && marks>=70)
			grade="B";
		else if(marks<70 && marks>=60)
			grade="C";
		else if(marks<60 && marks>=50)
			grade="D";
		else if(marks<50 && marks>=35)
			grade="E";
		else 
			grade="Try Next Sem!";
		
		System.out.println(grade);

	}

}
