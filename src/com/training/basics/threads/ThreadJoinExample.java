package com.training.basics.threads;

public class ThreadJoinExample {

	public static void main(String[] args) {

		WorkerThread thread1 = new WorkerThread(1);
		WorkerThread thread2 = new WorkerThread(2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted while waiting for threads to finish");
		}
		

		System.out.println("Both threads have finished!!");
	}

}

class WorkerThread extends Thread {

	private int threadId;

	public WorkerThread(int threadId) {
		this.threadId = threadId;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread " + threadId + " starting");
			Thread.sleep(2000);
			if(threadId == 2) {
				Thread.sleep(5000);
			}
			System.out.println("Thread " + threadId + " finished");
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadId + " Intterupted");
		}
	}

}
