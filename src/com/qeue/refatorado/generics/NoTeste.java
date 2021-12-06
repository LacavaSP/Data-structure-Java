package com.qeue.refatorado.generics;

public class NoTeste<T> {

	private T conteudo;
	private No refNo;
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No getRefNo() {
		return refNo;
	}
	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
	@Override
	public String toString() {
		return "conteudo:" + conteudo + "]";
	}
	
	
	
}
