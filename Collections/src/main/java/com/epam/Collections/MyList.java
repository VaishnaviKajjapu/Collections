package com.epam.Collections;

public class MyList<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[] = new Object[DEFAULT_CAPACITY ];
	
	public void add(Object ob ) {
	       if (size == elements.length) {
	           Modify();
	       }
	       elements[size] = ob;
	       size++;
	       
	   }
	private void Modify() {
	       int newSize = elements.length * 2;
	       Object[] newarr = new Object[newSize];
			for(int i=0;i<elements.length;i++){
				newarr[i]=elements[i];
			}
			elements= newarr;
	}
	
	
	
	public E get(int i) {
	       if (i >= size || i < 0) {
	           throw new IndexOutOfBoundsException("Index out of bound");
	       }
	       return (E) elements[i];
	   }
	
	
	
	
	public void remove(int i){
		System.out.println("The element is:" +elements[i]);
		if(i<0 ||i>=size()){
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		while(i<size()-1){
			elements[i]=elements[i+1];
			i++;
		}
		elements[i]=null;
		size--;
		
	}
	public void print(){
		System.out.print("(");
		for(int i=0;i<size;i++){
			System.out.print(elements[i]+" ");
		}
		System.out.print(")");
	}
	int size(){
		return size;
	}
	
	
		
}
