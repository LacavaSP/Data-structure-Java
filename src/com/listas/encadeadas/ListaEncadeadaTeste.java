package com.listas.encadeadas;

public class ListaEncadeadaTeste<T> {

	
	private No head;
	private int tamanhoLista=0;
	
	public ListaEncadeadaTeste() { head = null; }
	
	
	public boolean isEmpty() {
	return head==null?true:false;
	}

	private void decresceSize() {
		tamanhoLista--;
	}
	private void aumentaSize() {
		tamanhoLista++;
	}
	
	public int size() {
 
  return  tamanhoLista ;
				}
	
	
	public void add(T conteudo) {
		No<T> novoNo = new No(conteudo);
	if(isEmpty()) {
		this.aumentaSize();
		head = novoNo;
	}else {
		No<T> ponteiroAux = head;
		for(int i=0;i<this.size()-1;i++) {
			ponteiroAux = ponteiroAux.getProximoNo();
		}
		ponteiroAux.setProximoNo(novoNo);
		this.aumentaSize();
		
	}	
	
 
}

	private void validaIndice(int index){
		if(index > this.size()) {
			throw new IndexOutOfBoundsException("Não há nó com index: " + index);
		} 
	}
	
	public T get(int index) {
	/*	if(index==0) {
			throw new NullPointerException("A indexação dessa lista começa em 1, não em 0");
		}
		*/
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		No noIndex = head;
		No ponteiroAux = head;
		validaIndice(index);
		for(int i = 0; i<=index;i++) {
			noIndex = ponteiroAux;
			ponteiroAux = ponteiroAux.getProximoNo();
		}
		
		return noIndex;
	}
	
	public T remove(int index) {
		tamanhoLista--;
		No <T> ponteiroAux = this.getNo(index);
		if(index == 0) {
			head = ponteiroAux.getProximoNo();
			return  ponteiroAux.getConteudo(); //ATENÇÃO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
			No <T> noAnterior = this.getNo(index-1);
			
			noAnterior.setProximoNo(ponteiroAux.getProximoNo());
			
			return ponteiroAux.getConteudo();
	}
	
	@Override
	public String toString() {
		String str = "";
 
		No<T> ponteiroAux = head;
		
		if(ponteiroAux.getProximoNo()!=null) {
		for(int i = 1; i<this.size()+1;i++) {
			str+="Conteúdo"+"["+i+"]"+": "+ponteiroAux.getConteudo()+" aponta ---> ";
			ponteiroAux = ponteiroAux.getProximoNo();
		}
		str+="null";
		}else {
		str+="Unico elemento da lista: "+ponteiroAux.getConteudo();
		}
		return str;
	}
	
	
	
 
	
	
}