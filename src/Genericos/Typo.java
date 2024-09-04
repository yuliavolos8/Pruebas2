package Genericos;

public class Typo<T> {
	private T valor;

	public Typo() {

	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return " [" + valor + "]";
	}

}
