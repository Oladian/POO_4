package com.iesvirgendelcarmen.interfaces.teoria;

public class F extends B implements D {

	@Override
	public void metodoA2(String argumento) {
		System.out.println("Sobreescrito metodoA2 en la clase F");
	}
	
	@Override
	public int metodoD2(int numero) {
		return 0;
	}

}
