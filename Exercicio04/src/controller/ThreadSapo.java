package controller;

import java.util.Random;

public class ThreadSapo extends Thread {
	
	private String nomeSapo;
	private int maxPulo;
	private static int colocao = 0;
	
	public ThreadSapo(String nomeSapo, int maxPulo) {
		this.maxPulo = maxPulo;
		this.nomeSapo = nomeSapo;
	}
	
	@Override
	public void run() {
		corrida();
	}
	private void corrida() {
		
		int tId = (int) threadId();
		
		Random random = new Random();
		int distanciaCorrida = 100;
		int distanciaPercorrida = 0;
		long tempInicial = System.nanoTime();
		
		while(distanciaPercorrida < distanciaCorrida) {
			int pulo = random.nextInt(maxPulo + 1);
			distanciaPercorrida += pulo;
            System.out.println(nomeSapo + " pulou " + pulo + " metros. Distância percorrida: " + distanciaPercorrida + " metros.");
            try {
            	Thread.sleep(500);
            }catch(Exception e) {
            	System.err.println(e.getMessage());
            }
		}
		long tempFinal = System.nanoTime();
		double tempTotal = (tempFinal - tempInicial) / Math.pow(10, 9);
		colocao++;
		System.out.println(nomeSapo + " (Thread ID: " + tId + ") chegou na posição " + colocao + "! Tempo total: " + tempTotal + " segundos.");
	}
}
