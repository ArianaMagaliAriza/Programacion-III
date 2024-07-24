package ej7;
import java.util.Scanner;
import java.util.*;
import java.util.Iterator;
public class TestArrayList {
	public static void incisoDyE() {
		Scanner s= new Scanner(System.in);
		List <Estudiante> le= new ArrayList<Estudiante>();
		for(int i=0; i<3;i++) {
			System.out.println("Ingrese un nombre:");
			String n=s.next();
			System.out.println("Ingrese un apellido:");
			String a=s.next();
			System.out.println("Ingrese un email:");
			String e=s.next();
			System.out.println("Ingrese una direccion:");
			String d=s.next();
			System.out.println("Ingrese una comision:");
			int c=s.nextInt();
			Estudiante es=new Estudiante(n,a,e,d,c);
			le.add(i, es);
		}
		List <Estudiante> le2= new ArrayList<Estudiante>(le);
		for (Estudiante i:le)
			System.out.println(i);
		for (Estudiante i:le2)
			System.out.println(i);
		
		System.out.println("Ingrese un nombre:");
		String n=s.next();
		System.out.println("Ingrese un apellido:");
		String a=s.next();
		System.out.println("Ingrese un email:");
		String e=s.next();
		System.out.println("Ingrese una direccion:");
		String d=s.next();
		System.out.println("Ingrese una comision:");
		int c=s.nextInt();
		Estudiante es=new Estudiante(n,a,e,d,c);
		if(!le.contains(es))
			le.add(le.size()+1,es);
		s.close();
	}
	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		 int DimL = lista.size() - 1; 
	        for (int i = 0; i < (lista.size() / 2); i++) {
	            if ((lista.get(i) != lista.get(DimL)))
	                return false;
	            DimL--;
	        }
	        return true;
	}
       

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		List <Integer> l= new ArrayList<Integer>();
		int i=0;
		System.out.println("Ingrese un numero (Para finalizar ingrese -1):");
		int n=in.nextInt();
		while(n != -1) {
			l.add(i,n);
			i++;
			System.out.println("Ingrese un numero (Para finalizar ingrese -1):");
			n=in.nextInt();
		}
		Iterator<Integer> it= l.iterator();
		while(it.hasNext())
			System.out.println(it.next().intValue());
		//incisoDyE();
		ArrayList <Integer> l2= new ArrayList<Integer>(l);
		if(esCapicua(l2)){
	            System.out.println("Es capicua");}
	        else {
	            System.out.println("No es capicua");
	        }
		/*EjercicioSucesion ej= new EjercicioSucesion();
		ej.calcularSucesion(9);
		System.out.println(ej.sumarLinkedList());*/
		in.close();
	}

}
