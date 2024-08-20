package com.training.basics;

public class ForLoopDemo {
	
	public void executeForLoop() {
		
		/* for (initialization; termination; increment) {
			
			
			// statements
		} */
		
		
		/* for(int value = 0; value < 10; value++) { // 1, 2
			
			// statements
			System.out.println("current value :: " + value);
			
			if(value > 3) {
				break;
			}
									
		}
		
		System.out.println();
		
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("current value :: " + numbers[i]);
		}
		
		System.out.println();
		
		for(int currentValue : numbers) { // For each
			//logic
			System.out.println("coming from For each loop :: " + currentValue);
			if(true) {
				
			} else {
				
			}
			break;
		}
		
		System.out.println();
		
		
		int i = 0;
		for(; ;) {
			
			if(i < numbers.length) {
				// perform logic
			}
			
			i++;
			
			if(i == numbers.length) {
				break;
			}
			
			
		} */
		
		
		outer_For_loop:
		for(int value =0; value < 5; value++) {
			
			inner_For_loop:
			for(int value1 = 0; value1 < 5; value1++) {
				
				if(true) {
					// continue inner_For_loop;
					break inner_For_loop;
				}
				
				break;
			}
			
			if(value == 3) {
				continue;
			}
			
			//logic
			
			System.out.println("current value :: " + value);
			break;
			
		}
		
		
		
	}

}
