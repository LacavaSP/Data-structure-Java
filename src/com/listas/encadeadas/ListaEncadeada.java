package com.listas.encadeadas;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	//-------------------------------------------------------------
	
	public int Size() {
		int tamanhoLista = 0;
		No<T> referenciaAuxNo = referenciaEntrada;
		while(true){
			
			if(referenciaAuxNo!=null) {
				tamanhoLista++;
				
				if(referenciaAuxNo.getProximoNo()!=null) {
					
					referenciaAuxNo = referenciaAuxNo.getProximoNo();
					
				}else {
					break;
					}
			}else {
				break;
				}
		}
		return tamanhoLista;
	}
	
	//-------------------------------------------------------------
	
	public T get(int index) {
		
		return getNo(index).getConteudo();
	}
	//-------------------------------------------------------------
	
	public T remove(int index) {
		
		No<T> noPivo = this.getNo(index);
		
		if(index == 0) {
			referenciaEntrada = noPivo.getProximoNo();
			return noPivo.getConteudo();
		}
		No<T> noAnterior = getNo(index-1);
		
		noAnterior.setProximoNo(noPivo.getProximoNo());
		
		return noPivo.getConteudo(); 
		 
	}
	
	//-------------------------------------------------------------
	private No<T> getNo(int index){
		
		validaIndice(index);
		
		No<T>noAuxiliar = referenciaEntrada;
		No<T>noReterno = null;
		
		for(int i = 0; i<index;i++) {
			noReterno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noReterno;
	}
	
	//-------------------------------------------------------------
	
	private void validaIndice(int index){
		if(index > Size()) {
			throw new IndexOutOfBoundsException("Não há nó com index: " + index);
		} 
	}
	//-------------------------------------------------------------
	public boolean isEmpty() {
		return referenciaEntrada == null?true:false;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}	
		No<T> noAuxiliar = referenciaEntrada;
		for(int i=0;i<this.Size()-1;i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		noAuxiliar.setProximoNo(novoNo);
	}
	//-------------------------------------------------------------

	@Override
	
	public String toString() {
		
		String str = "";
		No<T> noAuxiliar = referenciaEntrada;
		for(int i =0; i< this.Size(); i++) {
			str+= "Conteudo =" + noAuxiliar.getConteudo();
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		str+="null";
		return str;
	}
	
	
	
	//-------------------------------------------------------------
}
