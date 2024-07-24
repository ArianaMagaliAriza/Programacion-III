package tp2;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		BinaryTree<Integer> root= new BinaryTree<Integer>(1);
		BinaryTree<Integer> HI= new BinaryTree<Integer>(2);
		BinaryTree<Integer> HD= new BinaryTree<Integer>(3);
		//HI.addLeftChild(new BinaryTree<Integer>(5));
		HI.addRightChild(new BinaryTree<Integer>(4));
		HD.addRightChild(new BinaryTree<Integer>(6));
		BinaryTree<Integer> HI2= new BinaryTree<Integer>(5);
		HI2.addLeftChild(new BinaryTree<Integer>(7));
		HI2.addRightChild(new BinaryTree<Integer>(8));
		HD.addLeftChild(HI2);
		root.addLeftChild(HI);
		root.addRightChild(HD);
		root.imprimirPorNivel();
		System.out.println();
		System.out.println();
		System.out.println();
		//Transformacion t=new Transformacion();
		//t.setA(root);
		//t.suma();
		ParcialArboles pa= new ParcialArboles();
		pa.setA(root);
		if(pa.isLeftTree(2)) System.out.println("YES");
		else System.out.println("NO");
		//root.imprimirPorNivel();
		
		//System.out.println("El arbol tiene "+a.contarHojas()+" hojas");
		//a.espejo();
		//a.entreNiveles(0, 2);
		in.close();
	}

}
