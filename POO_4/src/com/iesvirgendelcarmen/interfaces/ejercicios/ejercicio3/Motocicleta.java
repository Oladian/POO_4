package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio3;

public class Motocicleta implements Vehiculo {

	private String nombre;
	private int velocidad;
	
	public Motocicleta() {
		this.nombre = "moto";
		this.velocidad = 0;
	}

	@Override
	public String acelerar(int valor) {
		this.velocidad=valor;
		if(velocidad>VELOCIDAD_MAXIMA)
			System.out.println("Velocidad máxima sobrepasada.");
		return "La "+nombre+" ha pasado a velocidad "+velocidad;
	}

	@Override
	public String frenar(int valor) {
		this.velocidad=valor;
		return "La "+nombre+" ha pasado a velocidad "+velocidad;
	}

	public int numeroPlazas() {
		return 2;
	}
}
