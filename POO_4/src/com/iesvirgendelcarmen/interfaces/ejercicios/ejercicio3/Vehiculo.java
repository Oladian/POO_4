package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public interface Vehiculo {
	
	final int VELOCIDAD_MAXIMA = 120;
	
	String acelerar(int valor);
	String frenar(int valor);
	int numeroPlazas();
	void setTipoCombustible(TipoCombustible tipoCombustible);
}
