package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

public abstract class PoligonoRegular implements Comparable<PoligonoRegular>{
	String nombre;
	int numLados;
	double longitud;
	
	public PoligonoRegular(String nombre, int numLados, double longitud) {
		this.nombre = nombre;
		this.numLados = numLados;
		this.longitud = longitud;
	}
	
	public double getPerimetro() {
		return longitud*numLados;
	}
	
	public abstract double getArea();

	@Override
	public String toString() {
		return "PoligonoRegular nombre=" + nombre + ", longitud=" + longitud;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numLados != other.numLados)
			return false;
		return true;
	}

	@Override
	public int compareTo(PoligonoRegular poligonoRegular) {
		return numLados-poligonoRegular.numLados;
	}
}
