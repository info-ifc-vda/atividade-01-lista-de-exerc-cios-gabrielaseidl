import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        int i, j, n, primo, qtdPrimos;
        Scanner teclado = new Scanner(System.in);

        qtdPrimos = 0;

        for (i = 1; i <= 10; i++) 
        {
            System.out.print("Digite o " + i + "º número: ");
            n = teclado.nextInt();

            primo = 1;
            if (n <= 1) 
            {
                primo = 0;
            }
            else 
            {
                for (j = 2; j <= n / 2; j++)
                {
                    if (n % j == 0)
                    {
                        primo = 0;
                        break;
                    }
                }
            }

            if (primo == 1)
            {
                qtdPrimos++;
            }
        }

        System.out.println("Quantidade de números primos digitados: " + qtdPrimos);
    }
}
