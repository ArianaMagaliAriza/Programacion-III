package tp2;

import java.util.*;

public class ContadorArbol {
	private BinaryTree<Integer> a;
	
	public ContadorArbol(BinaryTree<Integer> a) {
		this.a = a;
	}

	public List<Integer> numerosParesInOrden() {
		List<Integer> list = new ArrayList<>();
		numerosParesIn(a, list);
		return list;
	}
		
	private static void numerosParesIn(BinaryTree<Integer> a,List<Integer> l) {
		
		if(a!=null && a.isEmpty()) {
			
			if (a.hasLeftChild()) {
				numerosParesIn(a.getLeftChild(),l);}
			
			if ((a.getData()%2)==0) {
				l.addLast(a.getData());}
			
			if (a.hasRightChild()) {
				numerosParesIn(a.getRightChild(),l);}
			
		}
	}
		
	
	public List<Integer> numerosParesPostOrden() {
		List<Integer> list = new ArrayList<>();
		numerosParesPost(a, list);
		return list;
	}
		
	private static void numerosParesPost(BinaryTree<Integer> a,List<Integer> l) {
		
		if(a!=null && a.isEmpty()) {
			
			if (a.hasLeftChild()) {
				numerosParesPost(a.getLeftChild(),l);}
			
			if (a.hasRightChild()) {
				numerosParesPost(a.getRightChild(),l);}
			
			if ((a.getData()%2)==0) {
				l.addLast(a.getData());}
			
		}
	}
}

