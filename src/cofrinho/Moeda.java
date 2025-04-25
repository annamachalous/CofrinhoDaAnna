package cofrinho;

public abstract class Moeda {
	protected double valor;

public Moeda(double valor) {
    this.valor = valor;
}

public abstract double converterParaReal();
public abstract String getNome();

public String toString() {
    return getNome() + " - " + valor;
}
}

