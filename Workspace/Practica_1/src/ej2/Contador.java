package ej2;
import java.util.Scanner;

public class Contador {
	public static void contar(int n){
		int [] c= new int [n];
		for(int i=0;i<n;i++)
			c[i]=n*(i+1);
		System.out.print("f("+n+")=[");
		for(int i=0;i<n-1;i++)
			System.out.print(c[i]+",");
		System.out.println(c[n-1]+"]");
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Ingrese un número:");
		int n=s.nextInt();
		while(n != -1) {
			contar(n);
			System.out.print("Ingrese un número:");
			n=s.nextInt();
		}
		s.close();
	}

}
