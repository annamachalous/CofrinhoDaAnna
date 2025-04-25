package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();
    
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
        System.out.println(moeda.getNome() + " adicionado ao cofrinho! 💰");
    }
    
    public void removerMoeda(Moeda moeda) {
        moedas.remove(moeda);
        System.out.println(moeda.getNome() + " removido do cofrinho! ❌");
    }
    
    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio. Que tal adicionar algumas moedinhas? 🪙");
        } else {
            System.out.println("Aqui estão suas riquezas guardadas:");
            for (int i = 0; i < moedas.size(); i++) {
                System.out.println(i + " - " + moedas.get(i));
            }
        }
    }
    
    public double calcularTotalEmReais() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }

    // Getter para acessar a lista de moedas
    public ArrayList<Moeda> getMoedas() {
        return moedas;
    }
}



