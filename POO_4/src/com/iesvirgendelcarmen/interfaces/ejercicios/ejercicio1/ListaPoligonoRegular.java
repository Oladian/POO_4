package com.iesvirgendelcarmen.interfaces.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPoligonoRegular {
	
	private List<PoligonoRegular> lista;
	
	public ListaPoligonoRegular(List<PoligonoRegular> lista) {
		this.lista = lista;
	}
	
	public ListaPoligonoRegular() {
		lista = new ArrayList<>();
	}
	

	public boolean addPoligono(PoligonoRegular poligono) {
		return lista.add(poligono);
	}
	
	public boolean removePoligono(PoligonoRegular poligono) {
		return lista.remove(poligono);
	}
	
	//devolver una lista ordenada de objetos PoligonoRegular
	//pero NO queremos que el atributo listaPoligonos quede
	//ordenado, el método sort de Collections hace eso
	
	public List<PoligonoRegular> getListaOrdenada(){
		List<PoligonoRegular> listaOrdenada = new ArrayList<>(lista);
		Collections.sort(listaOrdenada);
		return listaOrdenada;
	}

	public List<PoligonoRegular> getLista() {
		return lista;
	}
	
	
	
	
	/*public List<PoligonoRegular> ordenarLista(List<PoligonoRegular> lista) {
		listaOrdenada = Collections.sort(lista);
	}*/
}
