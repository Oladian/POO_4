package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio5;

public class TestMath3Profesor {
	public static void main(String[] args) {
		
		final int[] numeroInt = {11,2,3,45,3,1,4}; // Es una lista inmutable.
		
		double[] numeroDouble = new double[12];
		
		for (int i = 0; i < numeroDouble.length; i++) {
			numeroDouble[i]=(100*Math.random()+1);
			System.out.println("n["+i+"] = "+numeroDouble[i]); 
		}
		
		Math3Profesor m3p = new Math3Profesor(numeroInt, numeroDouble);
		
		System.out.println("Minimo "+m3p.min(numeroInt));
		System.out.println("Maximo "+m3p.max(numeroInt));
		
		System.out.println("Minimo "+m3p.min(numeroDouble));
		System.out.println("Maximo "+m3p.max(numeroDouble));
		
		System.out.println(m3p.toStringEnteros());
		System.out.println(m3p.toStringDoubles());
		
	}
}

class Math4 extends java.util.Random {
	private static final long serialVersionUID = 1L;

	
}
