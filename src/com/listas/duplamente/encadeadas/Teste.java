package com.listas.duplamente.encadeadas;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListaDuplamenteEncadeada<Object> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();
minhaListaDuplamenteEncadeada.add(1);//index 0
minhaListaDuplamenteEncadeada.add(2);//index 1
minhaListaDuplamenteEncadeada.add(3);//index 2
minhaListaDuplamenteEncadeada.add(4);//index 3
minhaListaDuplamenteEncadeada.add(5);//index 4
minhaListaDuplamenteEncadeada.add(6);//index 5
minhaListaDuplamenteEncadeada.add(7);//index 6

System.out.println(minhaListaDuplamenteEncadeada);
minhaListaDuplamenteEncadeada.remove(6);
System.out.println(minhaListaDuplamenteEncadeada);
minhaListaDuplamenteEncadeada.add(2, 2323);
System.out.println(minhaListaDuplamenteEncadeada);
	}

}
