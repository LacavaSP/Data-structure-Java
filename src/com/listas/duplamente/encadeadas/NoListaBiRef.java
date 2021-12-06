package com.listas.duplamente.encadeadas;

public class NoListaBiRef<T> {

	private NoListaBiRef<T> noPosterioRef;
	private NoListaBiRef<T> noAnteriorRef;
	private T conteudo;
	
	public NoListaBiRef(T conteudo) {
	this.conteudo=conteudo;
	noAnteriorRef = null;
	noPosterioRef = null;
	}
	
	
	
	
	public NoListaBiRef<T> getNoPosterioRef() {
		return noPosterioRef;
	}




	public void setNoPosterioRef(NoListaBiRef<T> noPosterioRef) {
		this.noPosterioRef = noPosterioRef;
	}




	public NoListaBiRef<T> getNoAnteriorRef() {
		return noAnteriorRef;
	}




	public void setNoAnteriorRef(NoListaBiRef<T> noAnteriorRef) {
		this.noAnteriorRef = noAnteriorRef;
	}




	public T getConteudo() {
		return conteudo;
	}




	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}




	@Override
	public String toString() {
		return " Conteudo=" + conteudo + "]";
	}
	
	
}
