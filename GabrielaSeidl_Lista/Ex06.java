import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        int n, i, fat = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = teclado.nextInt();

        for (i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println("Fatorial de " + n + " = " + fat);
    }
}
