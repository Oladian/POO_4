package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio5;

public class TestMath3 {
	public static void main(String[] args) {
		Math3 math3 = new Math3();
		int[] numeroInt = new int[12];
		double[] numeroDouble = new double[12];
		
			for (int i = 0; i < numeroInt.length; i++) {
				numeroInt[i]=(int) (100*Math.random()+1);
				System.out.println("n["+i+"] = "+numeroInt[i]); 
			}
		
		System.out.println("===================");
		System.out.println("Menor (int): "+math3.min(numeroInt));
		System.out.println("Mayor (int): "+math3.max(numeroInt));
		System.out.println("===================");
		
		for (int i = 0; i < numeroDouble.length; i++) {
			numeroDouble[i]=(int) (100*Math.random()+1);
			System.out.println("["+i+"] = "+numeroDouble[i]); 
		}
		System.out.println("====================");
		System.out.println("Menor (double):	"+math3.min(numeroDouble));
		System.out.println("Mayor (double):	"+math3.max(numeroDouble));
		System.out.println("====================");
	}
}
