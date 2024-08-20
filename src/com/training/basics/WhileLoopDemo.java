package com.training.basics;

public class WhileLoopDemo {
	
	public void whileLoop() {
		
		/* while(true) {
			// logic
			if(true) {
				
			}else {
				
			}
			
			break;
		} */
		
		int value = 1;
		while_loop:
		while(value < 5) {
			System.out.println("current value :: " + value);
			if(value == 3) {
				break while_loop;
			}
			value++;
		}
	}

}
