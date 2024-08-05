package operaciones;

public class ClaseDerivada_Divicion extends ClaseBase {

	@Override
	public void operaciones() {
		try {
			resultado = num1 / num2;
		} catch (Exception e) {
			System.out.println("ERROR!! no se puede dividir por zero " + e);

		} finally {
			System.out.println("operacion concluida");
		}
	}
}
