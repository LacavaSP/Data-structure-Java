package com.listas.encadeadas;

public class Listas {

	public static void main(String[] args) {
		ListaEncadeada<Object> minhaListaEncadeada = new ListaEncadeada<>();
		
		minhaListaEncadeada.add("teste1");
		minhaListaEncadeada.add("teste2");
		minhaListaEncadeada.add("teste3");
		minhaListaEncadeada.add("teste4");
		minhaListaEncadeada.add("teste5");
		
	System.out.println(minhaListaEncadeada.get(5));	
	minhaListaEncadeada.remove(5);
	System.out.println(minhaListaEncadeada);
	}

}
