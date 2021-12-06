package com.qeue.refatorado.generics;

public class Fila<T> {

	
	private No<T> refEntradaNo;
	
	public Fila() {
		this.refEntradaNo = null;
	}
	
	
	public void enQueue(T obj) {
		No novoNo = new No(obj);
		novoNo.setRefNo(refEntradaNo);
		refEntradaNo = novoNo;
	}
	
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntradaNo;
			No noAuxiliar = refEntradaNo;
			while (true) {
				 if(primeiroNo.getRefNo()!= null) {
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
	
	
	public T first() {
		if(!this.isEmpty()) {
			No primeiroNo = refEntradaNo;
			while (true) {
				 if(primeiroNo.getRefNo()!= null) {
					 primeiroNo = primeiroNo.getRefNo();
				 }else {
					break; 
				 }
				
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	
	
	public boolean isEmpty() {
		return refEntradaNo == null?true:false;
	}


	@Override
	public String toString() {
	String retorno = "";
	No noAuxiliarNo = refEntradaNo;
	
	if(refEntradaNo!= null) {
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
