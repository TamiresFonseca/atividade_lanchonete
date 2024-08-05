package org.lanchonete;

import java.util.HashMap;
import java.util.Map;

public class CadastrarProdutos {
    private static final String IMAGEM_DIR = "imagens_produtos";
    public static Map<Integer, Produto> produtos = new HashMap<>();


    public void inicializarProdutos() {
        produtos.put(1, new Produto(1, "Cachorro Quente", 4.00, IMAGEM_DIR + "/cachorro_quente.jpg"));
        produtos.put(2, new Produto(2, "X-Salada", 4.50, IMAGEM_DIR + "/x_salada.jpg"));
        produtos.put(3, new Produto(3, "X-Bacon", 5.00, IMAGEM_DIR + "/x_bacon.jpg"));
        produtos.put(4, new Produto(4, "Torrada simples", 2.00, IMAGEM_DIR + "/torrada_simples.jpg"));
        produtos.put(5, new Produto(5, "Refrigerante", 1.50, IMAGEM_DIR + "/refrigerante.jpg"));
    }


    public void adicionarProduto(int codigo, String especificacao, double preco, String caminhoImagem) {
        Produto produto = new Produto(codigo, especificacao, preco, caminhoImagem);
        produtos.put(codigo, produto);
        System.out.println("Produto adicionado com sucesso!");
    }


    public String calcularTotal(int codigo, int quantidade) {
        Produto produto = produtos.get(codigo);
        if (produto != null) {
            double total = produto.getPreco() * quantidade;
            return String.format("Total: R$ %.2f", total);
        } else {
            return "Código de produto inválido.";
        }
    }
}
