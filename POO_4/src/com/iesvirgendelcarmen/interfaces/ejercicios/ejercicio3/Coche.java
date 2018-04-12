package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;
public class Coche extends TipoVehiculo {

	private int potencia;
	
	public Coche(int velocidad, int numPlazas, int potencia) {
		super(velocidad, numPlazas);
		this.potencia = potencia;
	}
	
	public Coche(int potencia) {
		super(5); //numero de plazas, inicializa la velocidad a 0
		this.potencia = potencia;
	}

	@Override
	public String acelerar(int valor) {
		return getTipoCombustible()+" "+super.acelerar(valor);
	}

	@Override
	public String frenar(int valor) {
		return getTipoCombustible()+" "+super.frenar(valor);
	}

	@Override
	public int numeroPlazas() {
		return super.numeroPlazas();
	}

	public int getPotencia() {
		return potencia;
	}
	
	
}
