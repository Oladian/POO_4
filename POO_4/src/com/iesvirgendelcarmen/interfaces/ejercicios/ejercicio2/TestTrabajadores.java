package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio2;

public class TestTrabajadores {
	public static void main(String[] args) {
		Trabajador oficial1 = new Oficial("Pepe", "Pescador", "Trompetista");
		Trabajador oficial2 = new Oficial("Eusebio", "Del Bosque", "Embaucador");
		Trabajador tecnico1 = new Tecnico("Elena", "Ricachona", true);
		Trabajador tecnico2 = new Tecnico("Paco", "Almanzor", false);
	
		System.out.println( ((Oficial) oficial1).getClase());
		
		
		System.out.println(tecnico1+" "+tecnico1.sueldoMensual(25));
		System.out.println(tecnico2+" "+tecnico2.sueldoMensual(15));
		System.out.println(oficial1+" "+oficial1.sueldoMensual(5));
		System.out.println(oficial2+" "+oficial2.sueldoMensual(30));
	}
}
