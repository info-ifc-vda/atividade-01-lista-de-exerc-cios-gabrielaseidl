import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        int i, codigo, opcao, pos;
        double valor;
        int[] contas = new int[10];
        double[] saldos = new double[10];
        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta: ");
            contas[i] = teclado.nextInt();
            System.out.print("Digite o saldo da conta: ");
            saldos[i] = teclado.nextDouble();
        }

        opcao = 0; // inicializa
        while (opcao != 4) {
            System.out.println("\nMenu:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar ativo bancário");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o código da conta: ");
                codigo = teclado.nextInt();
                System.out.print("Digite o valor do depósito: ");
                valor = teclado.nextDouble();

                pos = -1;
                for (i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        pos = i;
                    }
                }
                if (pos != -1) {
                    saldos[pos] += valor;
                }

            } else if (opcao == 2) {
                System.out.print("Digite o código da conta: ");
                codigo = teclado.nextInt();
                System.out.print("Digite o valor do saque: ");
                valor = teclado.nextDouble();

                pos = -1;
                for (i = 0; i < 10; i++) {
                    if (contas[i] == codigo) {
                        pos = i;
                    }
                }
                if (pos != -1 && saldos[pos] >= valor) {
                    saldos[pos] -= valor;
                }

            } else if (opcao == 3) {
                double soma = 0;
                for (i = 0; i < 10; i++) {
                    soma += saldos[i];
                }
                System.out.println("Ativo bancário total: R$ " + soma);
            }
        }
    }
}
