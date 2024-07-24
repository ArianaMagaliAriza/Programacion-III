package ej7;
import java.util.*;

public class EjercicioSucesion {
	
	public List <Integer> calcularSucesion (int n){
		List <Integer> l= new ArrayList <Integer>();
		if(n!=1) {
			if ((n%2)==0){
				n=n/2;
			}
			else {
				n=(3*n)+1;
			}
            l.add(l.size(),n);
			calcularSucesion(n);
		}
	return l;
	}
	
	public int sumarLinkedList(LinkedList<Integer> lista) {
		int i;
		if(lista.isEmpty())
		    return 0;
		else {	
			i=lista.get(0);
			lista.remove(0);
			return i+sumarLinkedList(lista);
		}
		
	}
}