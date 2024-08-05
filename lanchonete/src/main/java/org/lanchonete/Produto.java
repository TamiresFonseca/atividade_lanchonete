package org.lanchonete;

public class Produto {
    private int codigo;
    private String especificacao;
    private double preco;
    private String caminhoImagem;


    public Produto(int codigo, String especificacao, double preco, String caminhoImagem) {
        this.codigo = codigo;
        this.especificacao = especificacao;
        this.preco = preco;
        this.caminhoImagem = caminhoImagem;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }
}
