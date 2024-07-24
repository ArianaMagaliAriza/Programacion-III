package ej8;

import java.util.*;

public class Queue<T> extends Sequence {
	
	final List<T> data;
	
	public Queue() {
		data = new ArrayList<>();
	}
	
	public void enqueue(T dato) {
		data.add(dato);
	}
	
	public T dequeue() {
		if (this.isEmpty())
			throw new IndexOutOfBoundsException("The queue is empty");
		
		return data.remove(0);
	}
	
	public T head() {
		if (this.isEmpty())
			throw new IndexOutOfBoundsException("The queue is empty");
		
		return data.get(0);
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	@Override
	public String toString() {
		String str = "[";
		
		for (T d : data)
			str += d + ", ";
		
		// elimino el ultimo ", "
		str = str.substring(0, str.length() - 2) + "]";
		
		return str;
	}
}
