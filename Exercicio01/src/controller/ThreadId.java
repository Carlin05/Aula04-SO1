package controller;

public class ThreadId extends Thread{
	public ThreadId() {
		super();
	}

	@Override
	public void run() {
		int tId = (int) threadId();
		System.out.println("Thread ID: "+ tId);
	}
	
}
