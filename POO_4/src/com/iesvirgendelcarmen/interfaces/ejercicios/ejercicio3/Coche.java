package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class Coche implements Vehiculo {

	private String nombre;
	private int velocidad;
	
	public Coche() {
		this.nombre = "coche";
		this.velocidad = 0;
	}

	@Override
	public String acelerar(int valor) {
		this.velocidad=valor;
		if(velocidad>VELOCIDAD_MAXIMA)
			System.out.println("Velocidad máxima sobrepasada.");
		return "El "+nombre+" ha pasado a velocidad "+velocidad;
	}

	@Override
	public String frenar(int valor) {
		this.velocidad=valor;
		return "El "+nombre+" ha pasado a velocidad "+velocidad;
	}

	public int numeroPlazas() {
		return 5;
	}
}
