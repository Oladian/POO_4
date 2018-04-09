package com.iesvirgendelcarmen.interfaces.teoria.estudiantes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEstudiante {
	
	
	public static void main(String[] args) {
		List<Estudiante> lista = new ArrayList();
		
		Estudiante est1 = new Estudiante("Paco", 62);
		Estudiante est2 = new Estudiante("Paca", 13);
		Estudiante est3 = new Estudiante("Pepe", 14);
		
		lista.add(est1);
		lista.add(est2);
		lista.add(est3);
		
		ArrayList<Estudiante> listaOriginal = (ArrayList<Estudiante>) lista;
		
		System.out.println(lista);
		
		Collections.sort(lista);
		
		System.out.println("Lista Ordenada: "+lista);
		
		System.out.println("Lista Original: "+listaOriginal);
		
		
	}
	
}
