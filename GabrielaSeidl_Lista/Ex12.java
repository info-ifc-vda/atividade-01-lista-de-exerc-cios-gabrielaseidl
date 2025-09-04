import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        int i, j, igual;
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os 10 números do primeiro vetor:");
        for (i = 0; i < 10; i++)
        {
            v1[i] = teclado.nextInt();
        }

        System.out.println("Digite os 10 números do segundo vetor:");
        for (i = 0; i < 10; i++)
        {
            v2[i] = teclado.nextInt();
        }

        System.out.println("Números não comuns:");
        for (i = 0; i < 10; i++)
        {
            igual = 0;
            for (j = 0; j < 10; j++)
            {
                if (v1[i] == v2[j])
                {
                    igual = 1;
                }
            }
            if (igual == 0)
            {
                System.out.print(v1[i] + " ");
            }
        }

        for (i = 0; i < 10; i++)
        {
            igual = 0;
            for (j = 0; j < 10; j++)
            {
                if (v2[i] == v1[j])
                {
                    igual = 1;
                }
            }
            if (igual == 0)
            {
                System.out.print(v2[i] + " ");
            }
        }
    }
}
