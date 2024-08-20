package com.training.basics.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> values = new LinkedList<>();
		
		values.add(10);
		values.add(20);
		values.add(15);
		
		System.out.println(values.poll());
		System.out.println(values.poll());
		System.out.println(values.poll());
		
		/* System.out.println(values.peek()); // 100 - print head
		System.out.println(values.poll()); // 100 - and will remove
		System.out.println(values.poll()); // 101 - print
		System.out.println(values.poll()); */
		// System.out.println(values.poll().toString());
		
		System.out.println("************* PQueue************");
		
		Queue<Integer> pQueue = new PriorityQueue();

		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		System.out.println(pQueue.poll());
		
		

	}

}
