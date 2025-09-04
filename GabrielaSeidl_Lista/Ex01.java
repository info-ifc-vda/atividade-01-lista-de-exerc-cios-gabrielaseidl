import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        double horas, valorHora, salarioBruto, imposto, salarioLiquido;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        horas = teclado.nextDouble();

        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = teclado.nextDouble();

        salarioBruto = horas * valorHora;
        imposto = salarioBruto * 0.30;
        salarioLiquido = salarioBruto - imposto;

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Imposto (30%): R$ " + imposto);
        System.out.println("Salário a receber: R$ " + salarioLiquido);
    }
}