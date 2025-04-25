package cofrinho;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;
        
        do {
            System.out.println("\n💰 Bem-vindo ao Cofrinho Mágico! 💰");
            System.out.println("1️ - Adicionar moeda");
            System.out.println("2️ - Remover moeda");
            System.out.println("3️ - Listar moedas");
            System.out.println("4️ - Calcular total em Reais");
            System.out.println("0️ - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo de moeda (1-Real, 2-Dólar, 3-Euro): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();
                    
                    if (tipo == 1) {
                        cofrinho.adicionarMoeda(new Real(valor));
                    } else if (tipo == 2) {
                        cofrinho.adicionarMoeda(new Dolar(valor));
                    } else if (tipo == 3) {
                        cofrinho.adicionarMoeda(new Euro(valor));
                    } else {
                        System.out.println("🤨 Opa! Essa moeda não existe no nosso cofrinho!");
                    }
                    break;
                
                case 2:
                    System.out.print("Digite o índice da moeda a remover: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < cofrinho.getMoedas().size()) {  
                        cofrinho.removerMoeda(cofrinho.getMoedas().get(indice));  
                    } else {
                        System.out.println("😕 Ih... Índice inválido!");
                    }
                    break;
                
                case 3:
                    cofrinho.listarMoedas();
                    break;
                
                case 4:
                    System.out.println("Total guardado em reais: R$" + cofrinho.calcularTotalEmReais());
                    break;
                
                case 0:
                    System.out.println("👋 Até mais! Continue economizando!");
                    break;
                
                default:
                    System.out.println("Opa! Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}

