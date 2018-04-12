package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio2;

public class Tecnico extends Trabajador {

	private final double PAGA_DIARIA = 200;
	private boolean titulacionSuperior;
	
	public Tecnico(String nombre, String apellidos, boolean titulacionSuperior) {
		super(nombre, apellidos);
		this.titulacionSuperior = titulacionSuperior;
	}

	@Override
	public double sueldoMensual(int diasTrabajados) {
		return PAGA_DIARIA*diasTrabajados;
	}

	public boolean isTitulacionSuperior() {
		return titulacionSuperior;
	}

}
