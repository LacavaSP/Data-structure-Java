package com.arvore.de.busca.binaria;

public class TesteExec<T> extends Teste<T> {

 Integer meuValor;
	
	
	public TesteExec(Integer MeuValor){
		this.meuValor=MeuValor;
	}
	
	@Override
	public boolean equals(Object o) {
		 
		return false;
	}
	@Override
	public int hashCode() {
	 
		return 0;
	}
	 
	public int compareTo(TesteExec<T> outro) {
		 int i = 0;
		 
		if(this.meuValor > outro.meuValor) {
		i = 1;
		 }else if(this.meuValor<outro.meuValor) {
			i = -1;
		 }
		
		return i;
	}
	@Override
	public String toString() {
 
		return  meuValor.toString();
	}

	@Override
	public int compareTo(T outro) {
		// TODO Auto-generated method stub
		return 0;
	}




}
