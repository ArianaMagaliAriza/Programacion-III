package tp2;

public class ParcialArboles {
	public BinaryTree<Integer> getA() {
		return a;
	}

	public void setA(BinaryTree<Integer> a) {
		this.a = a;
	}

	private BinaryTree<Integer> a;
	
	public boolean isLeftTree(int num) {
		boolean c=false;
		if(this.a!=null && !this.a.isEmpty()) {
			c=leftAux(this.getA(),num);
		}
		return c;
		}
	
	private static boolean leftAux(BinaryTree<Integer> a,int n) {
		boolean existe=false;
		int left=0;
		int right=0;
		if(a!=null) {
			if(a.getData()!=n) {
				if (a.hasLeftChild()) leftAux(a.getLeftChild(),n);
				if (a.hasRightChild()) leftAux(a.getRightChild(),n);
				}
			else if(a.getData()==n) {
				existe=true;
				if(a!=null) {
					if (a.hasLeftChild()) 
						left=contarUnicos(a.getLeftChild());
					else left=-1;
				        
					if (a.hasRightChild()) 
					    right=contarUnicos(a.getRightChild());
					else right=-1;
			}
	      }
		}
	    if (existe &&(left > right)) return true;
	    else return false;
	}
		
	private static int contarUnicos(BinaryTree<Integer> nodo) {
		if (nodo == null) return 0;

		int count = 0;
		
		if ((nodo.getLeftChild() == null && nodo.getRightChild() != null) ||
				(nodo.getLeftChild() != null && nodo.getRightChild() == null)) {
			count = 1;}

		count += contarUnicos(nodo.getLeftChild()) + contarUnicos(nodo.getRightChild());
        return count;
    }
	
	//public boolean esPrefijo(BinaryTree<Integer> a1, BinaryTree<Integer> a2) {
}
