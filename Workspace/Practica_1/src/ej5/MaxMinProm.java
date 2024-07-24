package ej5;
import java.util.Scanner;
public class MaxMinProm {
	static int mx=-1;
	static int mn=9999;
	static int p=0;
	
	public static int[] metodoReturn(int[] val) {//Hubiera estado copado hacer return de un objeto pq no se sabe la posición sin el comentario
		int [] res= new int[3];
		res[0]=-1;//MAXIMO
		res[1]=9999;//MINIMO
		res[2]=0;//PROMEDIO
		
		for(int i=0;i<val.length;i++) {
			if (val[i]>res[0]) res[0]=val[i];
			if (val[i]<res[1]) res[1]=val[i];
			res[2]=res[2]+val[i];
		}
		res[2]=res[2]/val.length;
		return res;
	}
	
	public static void metodoParametro(int[] val, Resultado res) {
		for(int i=0;i<val.length;i++) {
			if (val[i]>res.getMax()) res.setMax(val[i]);
			if (val[i]<res.getMin()) res.setMin(val[i]);
			res.setProm(res.getProm()+val[i]);
		}
		res.setProm(res.getProm()/val.length);
	}
	
	public static void metodoVariable(int[] val) {
		for(int i=0;i<val.length;i++) {
			if (val[i]>mx) mx=val[i];
			if (val[i]<mn) mn=val[i];
			p=p+val[i];
		}
		p=p/val.length;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numeros enteros a ingresar:");
		int n= s.nextInt();
		int[] v= new int[n];
		for(int i=0;i<v.length;i++) {
			System.out.println("Ingrese un numero entero:");
			v[i]= s.nextInt();
		}
		Resultado r = new Resultado(-1,9999,0);
		metodoParametro(v,r);
		metodoVariable(v);
		System.out.println("Max="+metodoReturn(v)[0]+" Min="+metodoReturn(v)[1]+" Promedio="+metodoReturn(v)[2]);
		System.out.println("Max="+r.getMax()+" Min="+r.getMin()+" Promedio="+r.getProm());
		System.out.println("Max="+ mx +" Min="+ mn +" Promedio="+ p);
		s.close();
	}

}
