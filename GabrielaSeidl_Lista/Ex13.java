import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        int i, j, qtdDiv;
        int[] v1 = new int[10];
        int[] v2 = new int[5];
        int[] r1 = new int[10];
        int[] r2 = new int[10];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os 10 números do primeiro vetor:");
        for (i = 0; i < 10; i++)
        {
            v1[i] = teclado.nextInt();
        }

        System.out.println("Digite os 5 números do segundo vetor:");
        for (i = 0; i < 5; i++)
        {
            v2[i] = teclado.nextInt();
        }

        // primeiro vetor resultante
        for (i = 0; i < 10; i++)
        {
            if (v1[i] % 2 == 0)
            {
                r1[i] = 0;
                for (j = 0; j < 5; j++)
                {
                    r1[i] += v1[i] + v2[j];
                }
            }
        }

        for (i = 0; i < 10; i++)
        {
            if (v1[i] % 2 != 0)
            {
                qtdDiv = 0;
                for (j = 0; j < 5; j++)
                {
                    if (v1[i] % v2[j] == 0)
                    {
                        qtdDiv++;
                    }
                }
                r2[i] = qtdDiv;
            }
        }

        System.out.println("Primeiro vetor resultante:");
        for (i = 0; i < 10; i++)
        {
            System.out.print(r1[i] + " ");
        }

        System.out.println("\nSegundo vetor resultante:");
        for (i = 0; i < 10; i++)
        {
            System.out.print(r2[i] + " ");
        }
    }
}
