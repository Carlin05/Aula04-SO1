package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int[] vt = new int[1000];
		for(int i = 0; i < vt.length; i++) {
			vt[i] = random.nextInt(100) + 1;
		}
		ThreadVetor thread1 = new ThreadVetor(vt, 1);
		ThreadVetor thread2 = new ThreadVetor(vt, 2);
		thread1.start();
		thread2.start();
	}

}
