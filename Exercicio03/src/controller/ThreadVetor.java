package controller;

public class ThreadVetor extends Thread {
	private int[] vt;
	private int numero;
	
	public ThreadVetor(int[] vt, int numero) {
		this.vt = vt;
		this.numero = numero;
	}
	
	@Override
	public void run() {
		operacao();
	}
	private void operacao() {
		long tempInicial = System.nanoTime();
		if(numero % 2 == 0) {
			for(int i = 0; i < vt.length; i++) {
				int valor = vt[i];
			}
		}else {
			for(int valor : vt) {
			}
		}
		long tempFinal = System.nanoTime();
		double tempDecorrido = (tempFinal - tempInicial) / Math.pow(10, 9);
        System.out.println("Número: " + numero + " | Tempo de execução: " + tempDecorrido + " segundos ");
	}
}
