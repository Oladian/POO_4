package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class TipoVehiculo implements Vehiculo {
	
	private int velocidad;
	private int numeroPlazas;
	private TipoCombustible tipoCombustible;
	
	public TipoVehiculo(int velocidad, int numPlazas) {
		this.velocidad = velocidad;
		this.numeroPlazas = numPlazas;
	}
	
	public TipoVehiculo(int numeroPlazas) {
	/*	this.velocidad = 0;
		this.numeroPlazas = numeroPlazas;*/
		
	/*	this.numeroPlazas = numeroPlazas;*/
		
		this(0, numeroPlazas);
	}	

	@Override
	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}

	@Override
	public String acelerar(int valor) {
		this.velocidad+=valor;
		if(this.velocidad>VELOCIDAD_MAXIMA)
			return "*** Velocidad máxima sobrepasada ***"+" ACELERANDO - Velocidad actual: "+this.velocidad;
		return " ACELERANDO - Velocidad actual: "+velocidad;
	}

	@Override
	public String frenar(int valor) {
		this.velocidad-=valor;
		if(this.velocidad<0)
			this.velocidad=0;
		if(this.velocidad>VELOCIDAD_MAXIMA)
			return "*** Velocidad máxima sobrepasada ***"+" FRENANDO - Velocidad actual: "+this.velocidad;
		return " FRENANDO - Velocidad actual: "+velocidad;
	}

	@Override
	public int numeroPlazas() {
		return this.numeroPlazas;
	}


}
