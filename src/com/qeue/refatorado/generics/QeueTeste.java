package com.qeue.refatorado.generics;

public class QeueTeste<T> {

	private No refEntrada;
	
	
	public QeueTeste() { refEntrada = null;}
	
	public void enQueue (T conteudo) {
		No<T> novoNo = new No(conteudo);
		novoNo.setRefNo(refEntrada);
		refEntrada = novoNo;
		
	}
	
	
	public T first() {
		if(!isEmpty()) {
			No<T> primeiroNo = refEntrada;
			boolean A = true;
			while(A) {
				primeiroNo = primeiroNo.getRefNo();
				if(primeiroNo.getRefNo()==null) {
					A = false;	
					return (T) primeiroNo.getObject();
				  
			}
			 
			}
		}
		return null;
	}
	public T deQueue() {
		if(!isEmpty()) {
			No primeiroNo= refEntrada;
			No noAuxiliar = refEntrada;
			//System.out.println("chamado");
		 while(true) {
			if(primeiroNo.getRefNo()!=null) {
				noAuxiliar = primeiroNo;
				primeiroNo = primeiroNo.getRefNo();
			}else {
				noAuxiliar.setRefNo(null);
				break;
			}
		 }
 return (T)primeiroNo.getObject();
		}
		 		return null;
		}
		
	
	public boolean isEmpty() {
		return refEntrada == null?true:false;
	}
	
	
	public String toString() {
		String retorno = "";
		No<T> noAuxiliarNo = refEntrada;
		
		if(refEntrada!= null) {
			while(true) {
			retorno += "No objeto=" + noAuxiliarNo.getObject() + "====}}";
			if(noAuxiliarNo.getRefNo()!= null) {
				noAuxiliarNo = noAuxiliarNo.getRefNo();
			}else {
				retorno+="null";
				break;
			      }
			}
		}else {
			retorno+="null";
		}
		
			return retorno;
		}
}
