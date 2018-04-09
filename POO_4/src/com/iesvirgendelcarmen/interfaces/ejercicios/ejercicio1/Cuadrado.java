package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double longitud) {
		super("Cuadrado", 4, longitud);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return longitud*longitud;
	}

}
