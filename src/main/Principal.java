package main;

import operaciones.ClaseDerivada_Resta;
import operaciones.ClaseDerivada_Suma;

public class Principal {
	public static void main(String[] args) {
		ClaseDerivada_Resta hija1 = new ClaseDerivada_Resta();
		
		hija1.pedirDatos();
		hija1.restar();
		System.out.print("el resultado de la resta es: ");
		hija1.mostrarResultado();
		System.out.println("-------------------");
		
		ClaseDerivada_Suma hija2 = new ClaseDerivada_Suma();
		hija2.pedirDatos();
		hija2.sumar();
		System.out.println("el resultado de la resta es: ");
		hija2.mostrarResultado();
	}
}
