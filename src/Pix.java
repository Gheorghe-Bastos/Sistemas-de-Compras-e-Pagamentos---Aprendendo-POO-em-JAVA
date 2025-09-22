import java.util.Scanner;

public class Pix extends InformacoesDePagamento{
    String chave_pix;

    Pix(String  nome_produto, int quantidade, int valor, String remetente, String destinatario, String chave_pix) {
        super(nome_produto, quantidade, valor, remetente, destinatario);

        this.chave_pix = chave_pix;
    }
    public void solicitar_dados_pix() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a chave pix do destinatario: ");
        this.chave_pix = sc.nextLine();
    }
    public void mostrar_dados_pix() {
        System.out.println("chave pix do destinatario: "+ chave_pix);
    }
}

