package tp2;

import java.util.*;
import java.util.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
		int hojas=0;
		if (this.isLeaf())
			return 1;
		else {
			if (this.hasLeftChild())
				hojas+=this.leftChild.contarHojas();
			if (this.hasRightChild())
				hojas+=this.rightChild.contarHojas();
			}

		return hojas;
	}
		
		
    public BinaryTree<T> espejo(){
    	BinaryTree<T> aux= new BinaryTree<T>(this.data); 
    	if(this.hasLeftChild()) 
    		aux.rightChild=this.getLeftChild().espejo();
    	if(this.hasRightChild()) 
    		aux.leftChild=this.getRightChild().espejo();
 	   return aux;
    }

	// 0<=n<=m

      public void entreNiveles(int n, int m) {
       	 BinaryTree<T> ab = null;
       	 Queue<BinaryTree<T>> cola = new LinkedList<BinaryTree<T>>();
       	 cola.offer(this);//enqueue
         cola.offer(null);//CORTAR NIVEL 
         
         int nivelActual=0;
         System.out.println("Nivel-"+nivelActual);
         
       	 while (!cola.isEmpty()) {
       		 ab = cola.poll();//dequeue
       		 if (ab != null) {
       	            if (nivelActual >= n && nivelActual <= m) {
       	                System.out.print(ab.getData() + " ");
       	            }
       			 if (ab.hasLeftChild()) {
       				 cola.offer(ab.getLeftChild());
       			 }
       			 if (ab.hasRightChild()) {
       				 cola.offer(ab.getRightChild());
       			 }
       		 } else if (!cola.isEmpty()) {
       			nivelActual++;
                // Si hemos alcanzado el nivel m, salimos del bucle
                if (nivelActual > m) {
                    break;
                }
       			 System.out.println();
       			 cola.offer(null);
       		 }
       	 }
      }
      
      public void imprimirPorNivel() {
        	 BinaryTree<T> ab = null;
        	 Queue<BinaryTree<T>> cola = new LinkedList<BinaryTree<T>>();
        	 cola.offer(this);//enqueue
        	 cola.offer(null);//CORTAR NIVEL 
          
        	 int nivelActual=0;
        	 System.out.println("Nivel-"+nivelActual);
        	 while (!cola.isEmpty()) {
        		 
        		 ab = cola.poll();//dequeue
        		 if (ab != null) {
        	         System.out.print(ab.getData() + " ");
        			 if (ab.hasLeftChild()) {
        				 cola.offer(ab.getLeftChild());
        			 }
        			 if (ab.hasRightChild()) {
        				 cola.offer(ab.getRightChild());
        			 }
        		 } else if (!cola.isEmpty()) {
        			 
        			 nivelActual++;
        			 System.out.println();
        			 System.out.println("Nivel-"+nivelActual);
        			 cola.offer(null);
        		 }
        	 }
       }
}
