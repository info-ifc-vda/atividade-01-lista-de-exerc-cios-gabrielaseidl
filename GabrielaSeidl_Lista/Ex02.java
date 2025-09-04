import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        double salarioMinimo, consumo, valorKW, valorTotal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = teclado.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        consumo = teclado.nextDouble();

        valorKW = salarioMinimo * 0.01;
        valorTotal = consumo * valorKW;

        System.out.println("Valor de cada quilowatt: R$ " + valorKW);
        System.out.println("Valor a ser pago: R$ " + valorTotal);
    }
}
