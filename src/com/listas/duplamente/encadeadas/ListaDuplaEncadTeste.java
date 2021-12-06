package com.listas.duplamente.encadeadas;

import com.listas.encadeadas.No;

public class ListaDuplaEncadTeste<T> {
	 
	private NoListaBiRef<T> ultimoNo;
	
	private NoListaBiRef<T> primeiroNo;
	private int tamanhoLista=0;
	 public ListaDuplaEncadTeste() {
		// TODO Auto-generated constructor stub
		 primeiroNo = null;
		 ultimoNo = null;
	this.primeiroNo = null;
	 }
	 
	 public boolean isEmpty() {
		 return primeiroNo==null?true:false;
	 }
	 
	 public void add(T conteudo) {
		 NoListaBiRef<T> novoNo = new NoListaBiRef<>(conteudo);
		
			 novoNo.setNoPosterioRef(null);
			novoNo.setNoAnteriorRef(ultimoNo);
			
			if(primeiroNo==null) {
				primeiroNo=novoNo;
			}
			if(ultimoNo!=null) {
				ultimoNo.setNoPosterioRef(novoNo);
			}
			ultimoNo = novoNo;
			tamanhoLista++;
		}
		
	
	 private void validaIndice(int index){
			if(index > this.size()) {
				throw new IndexOutOfBoundsException("Não há nó com index: " + index);
			} 
		}
		
 
		
		public int size() {
	 
	  return  tamanhoLista ;
					}
		
		public T get(int index) {
		 
				return getNo(index).getConteudo();
			}
			
		
			private NoListaBiRef<T> getNo(int index){
				NoListaBiRef<T> noIndex = primeiroNo;
				NoListaBiRef<T> ponteiroAux = primeiroNo;
				validaIndice(index);
				for(int i = 0; i<=index;i++) {
					noIndex = ponteiroAux;
					ponteiroAux = ponteiroAux.getNoPosterioRef();
				}
				
				return noIndex;
			}

			
			
			public void add(int index, T elemento) {

				NoListaBiRef<T> noAuxiliar = getNo(index);
				NoListaBiRef<T> novoNo = new NoListaBiRef<>(elemento);
				novoNo.setNoPosterioRef(noAuxiliar);
				
				if(novoNo.getNoPosterioRef()!=null) {
					novoNo.setNoAnteriorRef(noAuxiliar.getNoPosterioRef());
					novoNo.getNoPosterioRef().setNoAnteriorRef(novoNo);
				}else {
					novoNo.setNoAnteriorRef(novoNo);
					ultimoNo = novoNo;
				}
				if(index == 0) {
					primeiroNo = novoNo;
				}else {
					novoNo.getNoPosterioRef().setNoPosterioRef(novoNo);
				}
			}
			@Override
			public String toString() {
				String str = "";
				
				if(!isEmpty()) {
					NoListaBiRef<T> ponteiroAuxNo = primeiroNo;
					for(int i = 0; i<this.size();i++) {
						str+="Conteudo "+i+" :"+ponteiroAuxNo.getConteudo();
						ponteiroAuxNo=ponteiroAuxNo.getNoPosterioRef();
					}
					str+=" null";
					return str;
				}
				
				return "Lista nula!";
			}
			
			
			
			
		
}
