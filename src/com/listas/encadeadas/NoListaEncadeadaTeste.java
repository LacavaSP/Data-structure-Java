package com.listas.encadeadas;

public class NoListaEncadeadaTeste<T> {


	private No ponteiro;
	private T conteudo;
	
	public No getPonteiro() {
		return ponteiro;
	}
	public void setPonteiro(No ponteiro) {
		this.ponteiro = ponteiro;
	}
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "conteudo=" + conteudo + "]";
	}
	
	

}
