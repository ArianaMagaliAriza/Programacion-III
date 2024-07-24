package tp2;


public class Transformacion {
	private BinaryTree<Integer> a;
	
	public BinaryTree<Integer> getA() {
		return a;
	}
	public void setA(BinaryTree<Integer> a) {
		this.a = a;
	}
	public BinaryTree<Integer> suma(){
		
		if(this!=null && !this.getA().isEmpty()){
			a.setData(sumaAux(this.getA()));}
		return a;
		}
	private static int sumaAux(BinaryTree<Integer> a) {
		int sum=0;
		int aux=0;
		if(!a.isLeaf()){
			if(a.hasLeftChild()) {
				aux+=a.getLeftChild().getData();
		        a.setData(sum+=sumaAux(a.getLeftChild()));
			}
			
			if(a.hasRightChild()) {
				 aux+=a.getRightChild().getData();
			     a.setData(sum+=sumaAux(a.getRightChild()));
			    }
			
		}
		else {
			if(a.isLeaf()) {
				sum=a.getData();
				a.setData(0);
				return sum;
			}
		}
		
		//System.out.println("aux="+aux+" sum="+sum);
		return sum;
	}
}
