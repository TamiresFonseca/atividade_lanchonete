package org.lanchonete;

import java.util.Scanner;

public class Pedido {

    int quantidade;

    void gerarPedido (int pedido){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o número do seu pedido: ");
    int numero = scanner.nextInt();

    System.out.print("Informe a quantidade do seu pedido: ");
    int quantidade = scanner.nextInt();
    scanner.close();

}
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}



