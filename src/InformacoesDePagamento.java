import java.util.Scanner;

public class InformacoesDePagamento extends Produto {
    String remetente;
    String destinatario;

    InformacoesDePagamento(String  nome_produto, int quantidade, int valor, String remetente, String destinatario) {
        super(nome_produto, quantidade, valor);

        this.remetente = remetente;
        this.destinatario = destinatario;
    }
    public void dados_de_pagamento() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do remetente: ");
        this.remetente = sc.nextLine();

        while (!this.remetente.matches("[A-Za-z ]+")) {
            System.out.println("Índice inválido.");
            System.out.print("Digite o nome do remetente: ");

            this.remetente = sc.nextLine();
        }

        System.out.print("Digite o nome do destinatário: ");
        this.destinatario = sc.nextLine();

        while (!this.destinatario.matches("[A-Za-z ]+")) {
            System.out.println("Índice inválido.");
            System.out.print("Digite o nome do destinatário: ");

            this.destinatario = sc.nextLine();
        }
    }
    public void mostrar_informacoes_de_pagamento() {
        System.out.println("nome do remetente: "+ remetente);
        System.out.println("nome do destinatário: "+ destinatario);

    }
}
