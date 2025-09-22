import java.util.Scanner;

public class Produto {
    String nome_produto;
    int quantidade;
    int valor;

    Produto(String  nome_produto, int quantidade, int valor) {

        this.nome_produto = nome_produto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public void solicitar_dados_produto() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        this.nome_produto = sc.nextLine();

        System.out.print("Qual o valor desse produto?: ");
        this.valor = sc.nextInt();

        System.out.print("Quantas unidades desse produto você quer?: ");
        this.quantidade = sc.nextInt();
    }
    public void mostrar_dados_produto() {
        System.out.println("produto: " + nome_produto);
        System.out.println("valor R$: "+ valor);
        System.out.println("unidades: " + quantidade);
    }
}
