package com.training.basics;

public class SwitchCaseDemo {
	
	public void execute() {
		
		Day day1 = Day.MON;
		Day day2 = Day.TUE;

		switch (day2) { // TUE
		case MON:
			System.out.println("Its MON");
			break;
		case TUE:
			System.out.println("Its TUE");
			break;
		case WED:
			System.out.println("Its WED");
			break;
		default:
			System.out.println("not valid day");
		}
	}
	
	
	public void executeInt(int value) {
		
		// int value = 10;
		
		switch (value) { // 10
		
		case 5:
			System.out.println("Its value 5");
			break;
			
		case 10:
			System.out.println("Its value 10");
			break;
			
		case 15:
			System.out.println("Its value 5");
			break;

		default:
			System.out.println("some other value!!");
			break;
		}
		
		// remaining logic
		
		// <condition> ?  true : false;
	}

}
