package cofrinho;

public class Real extends Moeda {
    
    public Real(double valor) {
        super(valor);
    }
    
    // Implementação para converter o valor da moeda para Real
    
    public double converterParaReal() {
        return valor; // O valor em Real é o próprio valor
    }
    
    // Retornar o nome da moeda
  
    public String getNome() {
        return "Real";
    }
}

