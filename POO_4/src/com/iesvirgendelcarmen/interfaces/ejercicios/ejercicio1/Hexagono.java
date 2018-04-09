package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

public class Hexagono extends PoligonoRegular {

	public Hexagono(double longitud) {
		super("Hexagono", 6, longitud);
	}

	@Override
	public double getArea() {
		return (getPerimetro()*(longitud/1.15))/2;
	}

}
