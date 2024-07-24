package ej3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Estudiante e1;
		Estudiante e2;
		Profesor p1;
		Profesor p2;
		Profesor p3;
		
		System.out.println("Ingrese un nombre:");
		String n=s.next();
		e1.setNombre(n);
		System.out.println("Ingrese un apellido:");
		n=s.next();
		e1.setApellido(n);
		System.out.println("Ingrese un email:");
		n=s.next();
		e1.setEmail(n);
		System.out.println("Ingrese una direccion:");
		n=s.next();
		e1.setDireccion(n);
		System.out.println("Ingrese una comision:");
		int c=s.nextInt();
		e1.setComision(c);
		
		System.out.println("Ingrese un nombre:");
		n=s.next();
		e2.setNombre(n);
		System.out.println("Ingrese un apellido:");
		n=s.next();
		e2.setApellido(n);
		System.out.println("Ingrese un email:");
		n=s.next();
		e2.setEmail(n);
		System.out.println("Ingrese una direccion:");
		n=s.next();
		e2.setDireccion(n);
		System.out.println("Ingrese una comision:");
		c=s.nextInt();
		e2.setComision(c);
		
		System.out.println("Ingrese un nombre:");
		n=s.next();
		p1.setNombre(n);
		System.out.println("Ingrese un apellido:");
		n=s.next();
		p1.setApellido(n);
		System.out.println("Ingrese un email:");
		n=s.next();
		p1.setEmail(n);
		System.out.println("Ingrese una catedra:");
		n=s.next();
		p1.setCatedra(n);
		System.out.println("Ingrese una facultad:");
		n=s.next();
		p1.setFacultad(n);
		
		System.out.println("Ingrese un nombre:");
		n=s.next();
		p2.setNombre(n);
		System.out.println("Ingrese un apellido:");
		n=s.next();
		p2.setApellido(n);
		System.out.println("Ingrese un email:");
		n=s.next();
		p2.setEmail(n);
		System.out.println("Ingrese una catedra:");
		n=s.next();
		p2.setCatedra(n);
		System.out.println("Ingrese una facultad:");
		n=s.next();
		p2.setFacultad(n);
		
		System.out.println("Ingrese un nombre:");
		n=s.next();
		p3.setNombre(n);
		System.out.println("Ingrese un apellido:");
		n=s.next();
		p3.setApellido(n);
		System.out.println("Ingrese un email:");
		n=s.next();
		p3.setEmail(n);
		System.out.println("Ingrese una catedra:");
		n=s.next();
		p3.setCatedra(n);
		System.out.println("Ingrese una facultad:");
		n=s.next();
		p3.setFacultad(n);
		s.close();
	}
}