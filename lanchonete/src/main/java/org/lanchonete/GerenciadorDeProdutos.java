package org.lanchonete;

import java.util.Scanner;

public class GerenciadorDeProdutos {
    private CadastrarProdutos cadastrarProdutos;


    public GerenciadorDeProdutos(CadastrarProdutos cadastrarProdutos) {
        this.cadastrarProdutos = cadastrarProdutos;
    }


    public void cadastrarNovoProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do novo produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a especificação do produto: ");
        String especificacao = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o caminho da imagem do produto: ");
        String caminhoImagem = scanner.nextLine();


        cadastrarProdutos.adicionarProduto(codigo, especificacao, preco, caminhoImagem);
    }
}
