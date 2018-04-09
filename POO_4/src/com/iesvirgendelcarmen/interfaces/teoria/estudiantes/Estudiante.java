package com.iesvirgendelcarmen.interfaces.teoria.estudiantes;

public class Estudiante implements Comparable<Estudiante>{
	private String nombre;
	private int edad;
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	// Compara las edades
	@Override
	public int compareTo(Estudiante estudiante) {
		return this.edad-estudiante.edad;
	}
	
	
}
