package com.listas.circulares;

public class Teste {

	public static void main(String[] args) {
	 
ListaCircular<Object> lista = new ListaCircular();

lista.add(1);
lista.add(2);
lista.add(3);
lista.add(4);
lista.add(5);
lista.add(6);//1
lista.add(7);//0

System.out.println(lista);

 

System.out.println(lista);
System.out.println(lista.get(3));
	}

}
