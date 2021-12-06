package com.stacks;

import com.qeue.refatorado.generics.No;

public class Pilha<T> {
	private int tamanhoLista=0;
 private No<T> entrada,top;
 
 
 
public Pilha() {
	entrada = null;
    top = null;
}

public boolean isEmpty() {
	
	return entrada==null?true:false;
}

public void push(T conteudo) {
 No<T> novoNo = new No(conteudo);
novoNo.setRefNo(entrada);
 this.entrada = novoNo;
 tamanhoLista++;
}

public T pop() {
	No<T> noAuxiliar = entrada;
	 System.out.println(noAuxiliar.getObject());
 entrada = entrada.getRefNo();
 tamanhoLista--;
 
	 return (T)noAuxiliar;
}

 

 
@Override
public String toString() {
	 String str ="";
	 No<T> noAuxiliar=entrada;
 
 for(int i=0;i<tamanhoLista;i++) {
			 str+= " " + noAuxiliar.getObject()+"\n";
			 noAuxiliar=noAuxiliar.getRefNo();
		 
 }
	 return str;
}



}
