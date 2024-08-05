package org.lanchonete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CadastrarProdutos cadastrarProdutos = new CadastrarProdutos();

        cadastrarProdutos.inicializarProdutos();

        GerenciadorDeProdutos gerenciadorDeProdutos = new GerenciadorDeProdutos(cadastrarProdutos);

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar o menu de opções
            System.out.println("| CODIGO | ESPECIFICAÇÃO    | PREÇO  |");
            System.out.println("|--------|------------------|--------|");
            System.out.println("| 1      | Cachorro Quente  | R$ 4.00|");
            System.out.println("| 2      | X-Salada         | R$ 4.50|");
            System.out.println("| 3      | X-Bacon          | R$ 5.00|");
            System.out.println("| 4      | Torrada simples  | R$ 2.00|");
            System.out.println("| 5      | Refrigerante     | R$ 1.50|");
            System.out.println("| 6      | Cadastrar Produtos ");
            System.out.println("| 7      | Sair ");

            System.out.print("Digite o código da opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();

                    String resultado = cadastrarProdutos.calcularTotal(opcao, quantidade);
                    System.out.println(resultado);
                    break;
                case 6:
                    gerenciadorDeProdutos.cadastrarNovoProduto();
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
