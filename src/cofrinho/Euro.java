package cofrinho;

	public class Euro extends Moeda {
    // Cotação do Euro para Real
    private static final double COTACAO = 5.5;
    public Euro(double valor) {
        super(valor);
    }
    
    // Converter o valor da moeda para Real
    
    public double converterParaReal() {
        return valor * COTACAO;
    }
    
    // Retornar o nome da moeda
    
    public String getNome() {
        return "Euro";
    }
}

