package com.qeue.refatorado.generics;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		QeueTeste<Object> queue = new QeueTeste<>();
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
 
	 
		queue.deQueue();
System.out.println(queue.first());
queue.enQueue(333);
System.out.println(queue);
		
	}

}
