package com.hashcode.equals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Carro> listaCarros = new ArrayList<>();

listaCarros.add(new Carro("Ford"));

 
  listaCarros.add(new Carro("GM"));
  listaCarros.add(new Carro("Fiat"));
listaCarros.add(new Carro("Volks"));
listaCarros.add(new Carro("Renault"));
listaCarros.add(new Carro("Cytroen"));
 

Stack<Carro> stackCarros = new Stack<>();
stackCarros.push(new Carro("GM"));
stackCarros.push(new Carro("Fiat"));
stackCarros.push(new Carro("Volks"));
stackCarros.push(new Carro("Renault"));
stackCarros.push(new Carro("Cytroen"));
System.out.println(stackCarros);
System.out.println(stackCarros.peek());

System.out.println(listaCarros.contains(new Carro("GM")));
System.out.println((new Carro("GM")).hashCode());
	}

}
