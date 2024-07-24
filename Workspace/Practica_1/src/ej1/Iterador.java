package ej1;

public class Iterador {
	
    public static void iteracionFOR(int a,int b) {
    	for(int i=a;i<=b;i++)
    		System.out.println(i);
    }
    public static void iteracionWHILE(int a,int b) {
    	int i=a;
    	while(i<=b) {
    		System.out.println(i);
    		i++;
    	}
    }
    public static void recursion(int a,int b) {
    	
    	if(a<=b) {
    		System.out.println(a);
    		recursion(a+1,b);
    	}
    }
	public static void main(String[] args) {
		System.out.println(args.length);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("---------------------------");
		iteracionFOR(a,b);
		System.out.println("---------------------------");
		iteracionWHILE(a,b);
		System.out.println("---------------------------");
		recursion(a,b);
		//INGRESAR COMO PRIMER PARAMETRO EL VALOR A Y LUEGO EL DE B
	}

}
