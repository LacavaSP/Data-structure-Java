package com.listas.encadeadas;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListaEncadeadaTeste<Object> listaEnc = new ListaEncadeadaTeste<>();

 
 listaEnc.add(13);
 listaEnc.add(12);
 listaEnc.add(15);
 

  
 System.out.println(listaEnc);
System.out.println(listaEnc.remove(0));
System.out.println(listaEnc);
	}

}
