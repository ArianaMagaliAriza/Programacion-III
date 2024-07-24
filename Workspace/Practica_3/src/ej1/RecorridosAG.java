package ej1;
import ej1.GeneralTree;
import java.util.*;
public class RecorridosAG<T> {
	//private GeneralTree<T> a;
	
	public void traversalLevel(GeneralTree<T> tree) {
		List<T> result = new LinkedList<T>();
		GeneralTree<T> tree_aux;
		Queue<GeneralTree<T>> queue = new LinkedList<GeneralTree<T>>();
		
		queue.offer(tree);
		queue.offer(null);
		
		while (!queue.isEmpty()) {
			tree_aux = queue.poll();
			if(tree_aux!=null) {
				System.out.println(tree.getData()+" ");
				List<GeneralTree<T>> children = tree_aux.getChildren();
				for (GeneralTree<T> child: children) {// Los dos puntos son por for each
					queue.offer(child);
				}
				else {//si es null terminó el nivel y la cola no es vacia tengo mas niveles
					//queue.offer(tree_aux)//
				}
			}
		}
	}
}