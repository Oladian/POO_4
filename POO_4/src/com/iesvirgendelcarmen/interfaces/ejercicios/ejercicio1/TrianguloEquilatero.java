package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

public class TrianguloEquilatero extends PoligonoRegular {

	public TrianguloEquilatero(double longitud) {
		super("Triangulo Equilatero", 3, longitud);
	}

	@Override
	public double getArea() {
		return longitud*longitud/2;
	}

}
