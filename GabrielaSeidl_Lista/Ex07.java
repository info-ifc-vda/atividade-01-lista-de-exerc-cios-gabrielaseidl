import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){

        int a, b, aux, n, i, fat=1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        a = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        b = teclado.nextInt();

        if (a > b) 
        {
            aux = a;
            a = b;
            b = aux;
        }

        for (n = a; n <= b; n++) 
        {
            for (i = 1; i <= n; i++) 
            {
                fat *= i;
            }
            System.out.println("Fatorial de " + n + " = " + fat);
        }
    }
}
