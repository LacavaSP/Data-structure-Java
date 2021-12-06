package com.qeue.refatorado.generics;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fila<Object> minhaFila = new Fila();
 
minhaFila.enQueue("No1");
minhaFila.enQueue("No2");
minhaFila.enQueue("No3");
minhaFila.enQueue("No4");
minhaFila.enQueue("No5");

 
System.out.println(minhaFila);
	}

}
