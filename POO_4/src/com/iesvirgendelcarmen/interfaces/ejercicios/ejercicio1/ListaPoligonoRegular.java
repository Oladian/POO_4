package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListaPoligonoRegular {
	private List<PoligonoRegular> lista = new ArrayList<>();
	
	public boolean añadirPoligono(PoligonoRegular poligono) {
		return lista.add(poligono);
	}

	public List<PoligonoRegular> getLista() {
		return lista;
	}
}
