package controller;

public class ThreadCalc extends Thread{
	private int vetor[] = new int[5];
	private int linhaIndice;
	public ThreadCalc(int[] vetor, int linhaIndice) {
		this.vetor = vetor;
		this.linhaIndice = linhaIndice;
	}
	@Override
	public void run() {
		calc();
	}
	private void calc() {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++ ) {
			soma += vetor[i];
		}
		System.out.println("Linha " + linhaIndice + ": Soma = " + soma);
	}
}
