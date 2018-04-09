package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio2;

public class Oficial extends Trabajador {

	private static final double PAGA_DIARIA=100;
	private String clase;

	public Oficial(String nombre, String apellidos, String clase) {
		super(nombre, apellidos);
		this.clase = clase;
	}

	public String getClase() {
		return clase;
	}
	
	@Override
	public double sueldoMensual(int diasTrabajados) {
		return PAGA_DIARIA*diasTrabajados;
	}




}
