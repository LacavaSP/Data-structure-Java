package com.stacks;

public class No<T> {

private T conteudo;
private No<T> ponteiro;


public No(T conteudo) {
	this.ponteiro = null;
	this.conteudo = conteudo;
}
public T getConteudo() {
	return conteudo;
}

 
public void setConteudo(T conteudo) {
	this.conteudo = conteudo;
}


public No<T> getPonteiro() {
	return ponteiro;
}


public void setPonteiro(No<T> ponteiro) {
	this.ponteiro = ponteiro;
}


@Override
public String toString() {
	return "No [conteudo=" + conteudo + "]";
}

 
}
