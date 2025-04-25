package cofrinho;

	public class Dolar extends Moeda {
	    // A cotação do Dolar para Real
	    private static final double COTACAO = 5.0;
	    public Dolar(double valor) {
	        super(valor);
	    }
	    
	    // Converter o valor da moeda para Real
	    public double converterParaReal() {
	        return valor * COTACAO;
	    }
	    
	    // Retorno do nome da moeda
	    public String getNome() {
	        return "Dólar";
	    }
	}

