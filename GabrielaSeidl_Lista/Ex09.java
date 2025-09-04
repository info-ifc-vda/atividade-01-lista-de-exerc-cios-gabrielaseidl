import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        int n, i, primo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = teclado.nextInt();

        primo = 1;
        if (n <= 1) 
        {
            primo = 0;
        }
        else 
        {
            for (i = 2; i <= n / 2; i++) 
            {
                if (n % i == 0) 
                {
                    primo = 0;
                    break;
                }
            }
        }

        if (primo == 1) 
        {
            System.out.println(n + " é primo.");
        }
        else 
        {
            System.out.println(n + " não é primo.");
        }
    }
}
