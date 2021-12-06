package com.listas.circulares;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	//-----------------------------------------------	
	
	public ListaCircular() {
		this.cauda = null;
		this.cabeca = null;
		this.tamanhoLista = 0;
	}
//-----------------------------------------------	
	public int size() {
		return tamanhoLista;
	}
//-----------------------------------------------		
	public boolean isEmpty() {
		
		return this.size() == 0?true:false;
	}
//-----------------------------------------------		
	private No<T> getNo(int index){
		if(this.isEmpty()) 
			throw new IndexOutOfBoundsException("Lista vazia");
			if(index==0) {
				return this.cauda;
			}
		No<T> noAuxiliar = this.cauda;
		for(int i = 0; (i < index) && (noAuxiliar!=null); i++ ) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}
//-----------------------------------------------		
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
//-----------------------------------------------		
	public void remove(int index) {
		if(index>= this.tamanhoLista) 
			throw new IndexOutOfBoundsException("O �ndice � maior que o tamanho da lista");
No<T> noAuxiliar = this.cauda;
if(index == 0) {
	this.cauda = this.cauda.getNoProximo();
	this.cabeca.setNoProximo(this.cauda);
}else if(index==1) {
	this.cauda.setNoProximo(this.cauda.getNoProximo());
}else {
	for(int i = 0; i < index-1;i++) {
		noAuxiliar = noAuxiliar.getNoProximo();
	}
	noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
}
this.tamanhoLista--;
	}	
//-----------------------------------------------		
public void add(T conteudo) {
	No<T> novoNo = new No<>(conteudo);
	if(this.tamanhoLista==0) {
		this.cabeca = novoNo;
		this.cauda = this.cabeca;
		this.cabeca.setNoProximo(cauda);
	}else {
		novoNo.setNoProximo(this.cauda);
		this.cabeca.setNoProximo(novoNo);
		this.cauda = novoNo;
	}
	this.tamanhoLista++;
}
//-----------------------------------------------
@Override
public String toString() {
	
	String str ="";
	No<T>noAuxiliar = this.cauda;
	for(int i=0;i<this.size();i++) {
		str += "Conteudo=" + noAuxiliar + " ==>>";
		noAuxiliar = noAuxiliar.getNoProximo();
	}
	
  		str += isEmpty()? "{ }":"(Retorna ao in�cio)";
	return str;
}



//-----------------------------------------------
}
