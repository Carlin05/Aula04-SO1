package view;

import controller.ThreadId;

public class Main {
	public static void main(String[]Args) {
		for(int i = 0; i < 5; i++) {
			ThreadId th = new ThreadId();
			th.start();
		}
	}
}
