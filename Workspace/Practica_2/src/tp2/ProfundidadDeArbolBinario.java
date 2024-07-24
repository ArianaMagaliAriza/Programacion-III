package tp2;

import java.util.*;

public class ProfundidadDeArbolBinario {
	private BinaryTree<Integer> a;
	
	public ProfundidadDeArbolBinario(BinaryTree<Integer> a) {
		this.a = a;
	}

	public BinaryTree<Integer> getA() {
		return a;
	}

	public void setA(BinaryTree<Integer> a) {
		this.a = a;
	}

	public int sumaElementosProfundidad(int p) {
		BinaryTree<Integer> ab = null;
      	Queue<BinaryTree<Integer>> cola = new LinkedList<BinaryTree<Integer>>();
      	cola.offer(this.getA());//enqueue
        cola.offer(null);//CORTAR NIVEL 
        
        int suma=0;
        int nivelActual=0;
        
      	 while (!cola.isEmpty()) {
      		 ab = cola.poll();//dequeue
      		 nivelActual++;
      		 if (ab != null) {
      	         if (nivelActual==p) {
      	              suma+=ab.getData();
      	            }
      			 if (ab.hasLeftChild()) {
      				 cola.offer(ab.getLeftChild());
      			 }
      			 if (ab.hasRightChild()) {
      				 cola.offer(ab.getRightChild());
      			 }
      		 } else if (!cola.isEmpty()) {
      			
               // Si hemos alcanzado el nivel p, salimos del bucle
               if (nivelActual > p) {
                   break;
               }
      			 System.out.println();
      			 cola.offer(null);
		}
		
	}
		return suma;
	}
}
