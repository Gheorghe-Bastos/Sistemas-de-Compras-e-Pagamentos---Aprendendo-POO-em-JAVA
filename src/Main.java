import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto("", 0, 0);

        InformacoesDePagamento infodepagamento = new InformacoesDePagamento(
                "", 0, 0, "", "");

        Pix pix = new Pix("", 0, 0, "", "", "");

        CartaoDebitoECredito cartao_debito_credito = new CartaoDebitoECredito("", 0, 0,
                "", "", "", 0, "", 0);

        produto.solicitar_dados_produto();

        infodepagamento.dados_de_pagamento();

        System.out.println("Qual a forma de pagamento?");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão Débito/Crédito");
        System.out.println("Opção: ");

        int escolha = sc.nextInt();

        if (escolha == 1) {
            pix.solicitar_dados_pix();
            produto.mostrar_dados_produto();
            infodepagamento.mostrar_informacoes_de_pagamento();
            pix.mostrar_dados_pix();

        } else if (escolha == 2) {
            cartao_debito_credito.solicitar_dados_cartao();
            produto.mostrar_dados_produto();
            infodepagamento.mostrar_informacoes_de_pagamento();
            cartao_debito_credito.mostrar_dados_cartao();

        }
    }
}