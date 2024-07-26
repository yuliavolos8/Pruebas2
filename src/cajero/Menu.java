package cajero;

import java.util.Scanner;

public class Menu {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		CajeroAutomat cajero = new CajeroAutomat(500.85, 888992222);

		int opcion = 0;
		double cantRetirar;
		double cantAniadir;
		do {
			System.out.println("-----------------------------");
			System.out.println(" Eligue una opcion:\n1. Consulta tu saldo " + "\n2. Retiro de efectivo "
					+ "\n3. deposito de efectivo \n4. Salir");
			System.out.println("-----------------------------");
			opcion = sc.nextInt();
			if (opcion < 1 || opcion > 4) {
				System.out.println(" inserte una opcion de 1 a 4 ");
			}
			sc.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("-------------------------");
				System.out.println("tu saldo es : " + cajero.getSaldo() + " euros");
				System.out.println("-------------------------");
				break;

			case 2:
				if (opcion == 2) {
					System.out.println("inserte cantidad de dinero que quieres retirar");
					cantRetirar = sc.nextDouble();

					System.out.println("-------------------------");
					System.out.println("tu saldo es : " + cajero.retirarDinderoSaldo(cantRetirar) + "euros ");
					System.out.println(" has retirado " + cantRetirar + " euros");
				}
				break;

			case 3:
				System.out.println("-------------------------");
				System.out.println("inserte que cantidad quieres aniadir");
				cantAniadir = sc.nextDouble();
				sc.nextLine();
				System.out.println("has depositado :" + cantAniadir + " euros");
				System.out.println("tu saldo es : " + cajero.ingresarDineroSaldo(cantAniadir) + "euros");
				System.out.println("-------------------------");
				break;
			case 4:
				System.out.println("¡¡¡ Hasta Pronto!!! ");
				break;
			default:
				System.out.println("eligue una opcion correcta");
			}
		} while (opcion != 4);

	}
}
