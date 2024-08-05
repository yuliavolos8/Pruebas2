package main;

import operaciones.ClaseDerivada_Resta;
import operaciones.ClaseDerivada_Suma;
import operaciones.ClaseBase;
import operaciones.ClaseDerivada_Divicion;

public class Principal {
	public static void main(String[] args) {
		ClaseBase hija1 = new ClaseDerivada_Resta();
		hija1.pedirDatos();
		hija1.operaciones();
		System.out.print("el resultado de la resta es: ");
		hija1.mostrarResultado();
		System.out.println("-------------------");

		ClaseBase hija2 = new ClaseDerivada_Suma();

		hija2.pedirDatos();
		hija2.operaciones();
		System.out.println("el resultado de la suma es: ");
		hija2.mostrarResultado();

		ClaseBase hija3 = new ClaseDerivada_Divicion();
		hija3.pedirDatos();
		hija3.operaciones();
		System.out.print("el resultado de la divicion es : ");
		hija3.mostrarResultado();
	}
}
