package com.iesvirgendelcarmen.interfaces.teoria;

public class E implements A, D {

	@Override
	public int metodoD2(int numero) {
		return numero*2;
	}

	@Override
	public void metodoA1() {
		System.out.println("Implementando metodo A1");
	}

	@Override
	public void metodoA2(String argumento) {
		System.out.println("En el metodo 2 "+argumento);
	}

}
