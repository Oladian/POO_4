package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio2;

public abstract class Trabajador {
	private String nombre;
	private String apellidos;
	
	public Trabajador(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	protected String nombreApellidos() {
		return nombre+" - "+apellidos;
	}
	
	public abstract double sueldoMensual(int diasTrabajados);

	@Override
	public String toString() {
		return  nombre + " " + apellidos + " cobrará";
	} 
	
	
}
