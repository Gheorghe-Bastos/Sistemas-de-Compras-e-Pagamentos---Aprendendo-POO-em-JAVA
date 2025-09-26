import java.util.Scanner;

public class CartaoDebitoECredito extends InformacoesDePagamento{
    String titular;
    String numero_do_cartao;
    String vencimento;
    String codigo_cvc;

    CartaoDebitoECredito(String  nome_produto, int quantidade, int valor, String remetente, String destinatario, String titular,
                         String numero_do_cartao, String vencimento, String codigo_cvc) {
    super(nome_produto, quantidade, valor, remetente, destinatario);

    this.titular = titular;
    this.numero_do_cartao = numero_do_cartao;
    this.vencimento = vencimento;
    this.codigo_cvc = codigo_cvc;
    }
    public void solicitar_dados_cartao() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        this.titular = sc.nextLine();

        while (!this.titular.matches("[A-Za-z ]+")) {
            System.out.println("Índice inválido.");
            System.out.print("Digite o nome do titular: ");

            this.titular = sc.nextLine();
        }

        System.out.print("Digite o número do cartão: ");

        while (!this.numero_do_cartao.matches("[0-9]+")) {
            System.out.println("Índice inválido.");
            System.out.print("Digite o número do cartão: ");

            this.numero_do_cartao = sc.nextLine();
        }

        System.out.print("Digite a data de vencimento: ");
        this.vencimento = sc.nextLine();

        while (!this.vencimento.matches("[0-9/]+")) {
            System.out.println("Índice inválido.");
            System.out.print("Digite a data de vencimento: ");

            this.vencimento = sc.nextLine();
        }

        System.out.print("digite o código cvc: ");

        while (!this.codigo_cvc.matches("[0-9]+")) {
            System.out.println("Índice inválido.");
            System.out.print("digite o código cvc: ");

            this.codigo_cvc = sc.nextLine();
        }
    }
    public void mostrar_dados_cartao() {
        System.out.println("Nome do titular: "+ titular);
        System.out.println("Número do cartão: "+ numero_do_cartao);
        System.out.println("Data de vencimento: "+ vencimento);
        System.out.println("Código cvc: "+ codigo_cvc);
    }
}
