package cajero;

public class CajeroAutomat {
	private double saldo;
	private long numeroCuenta;

	public CajeroAutomat(double saldo, long numeroCuenta) {
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double retirarDinderoSaldo(double cantidad) throws IllegalArgumentException {
		if (cantidad > this.saldo) {
			throw new IllegalArgumentException("el saldo no es suficiente para retirar " + cantidad + " euros");
		} else {
			this.saldo -= cantidad;
			return this.saldo;
		}
	}

	public double ingresarDineroSaldo(double cant) {
		this.saldo += cant;
		return this.saldo;
	}
}