package Genericos;

public class MainType {

	public static void main(String[] args) {

		Typo<String> nomb = new Typo();
		nomb.setValor("Java");
		System.out.println("Nombrede String es :" + nomb);

		Typo<Integer> num = new Typo();

		num.setValor(123);
		System.out.println("Valor de numero entero es:" + num);
	}

}
