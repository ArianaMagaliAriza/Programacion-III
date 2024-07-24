package tp2;

public class RedBinariaLlena {
	private BinaryTree<Integer> a;
	
	public BinaryTree<Integer> getA() {
		return a;
	}

	public void setA(BinaryTree<Integer> a) {
		this.a = a;
	}

	public int retardoReenvio() {
		if (this.getA().isEmpty()) return -1;
		else {
			int retMax=-9999;
			int retardoActual=0;
			retardoMax(this.getA(),retMax, retardoActual);
			return retMax;
		}
	}
		
	private static int retardoMax(BinaryTree<Integer> a,int max,int actual) {
		if (!a.isLeaf()) {
			actual+=a.getData();
		
			if (a.hasLeftChild())
				actual+=retardoMax(a.getLeftChild(),max,actual);
		
			if (a.hasRightChild())
				actual+=retardoMax(a.getRightChild(),max,actual);
		}
		else if (actual>max) max=actual;
		
		return 0;
	}
}
