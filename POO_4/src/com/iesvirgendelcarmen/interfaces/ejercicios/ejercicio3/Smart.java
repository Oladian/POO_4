package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class Smart extends Coche {

	public Smart(int numPlazas, int potencia) {
		super(2, numPlazas, potencia);
	}

	public Smart(int potencia) {
		super(2, 4, potencia);
	}
	
	@Override
	public String acelerar(int valor) {
		return "Smart "+super.acelerar(valor);
	}

	@Override
	public String frenar(int valor) {
		return "Smart "+super.frenar(valor);
	}
	
	
}
