package com.iesvirgendelcarmen.interfaces.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestInterfaces {
	public static void main(String[] args) {
		
		List<A> lista = new ArrayList<>();
		
		A referencia = new B(); // B implementa A, se usa polimorfismo
		B nuevaReferencia = new C(); // C extiende de B, que implementa A, se usa polimorfismo
		A otraReferencia = new E();
		//D otraNuevareferencia = new E();
		E anotherReferencia = new E();
		F f1 = new F(); // Se puede añadir a la lista
		B f2 = new F();	// Se puede añadir a la lista
		A f3 = new F();	// Se puede añadir a la lista
		//D f4 = new F();	// NO se puede añadir a la lista

		referencia.metodoA1();
		referencia.metodoA2("argumento1");
		nuevaReferencia.metodoA1();
		lista.add(referencia);
		lista.add(nuevaReferencia);
		lista.add(otraReferencia);
		
		// La siguiente línea da ERROR: "otraReferencia" no es de tipo A, sino tipo D; la lista está parametrizada
		// al tipo A.
			//lista.add(otraNuevareferencia);
		
		// Aquí si admite añadirlo a la lista, porque E implementa A, SIEMPRE.
		lista.add(anotherReferencia);
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		//lista.add(f4); ERROR

		
		for (A a : lista) {
			a.metodoA1();
			a.metodoA2("Argumento");
		}
		
		
		
	}
}
