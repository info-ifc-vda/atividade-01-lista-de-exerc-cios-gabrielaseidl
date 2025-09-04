import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        int i, j;
        int[][] mat = new int[7][7];
        int[] maiorLinha = new int[7];
        int[] menorColuna = new int[7];
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 7x7:");
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }

        for (i = 0; i < 7; i++) {
            maiorLinha[i] = mat[i][0];
            for (j = 1; j < 7; j++) {
                if (mat[i][j] > maiorLinha[i]) {
                    maiorLinha[i] = mat[i][j];
                }
            }
        }

        for (j = 0; j < 7; j++) {
            menorColuna[j] = mat[0][j];
            for (i = 1; i < 7; i++) {
                if (mat[i][j] < menorColuna[j]) {
                    menorColuna[j] = mat[i][j];
                }
            }
        }

        System.out.println("Matriz digitada:");
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maior elemento de cada linha:");
        for (i = 0; i < 7; i++) {
            System.out.print(maiorLinha[i] + " ");
        }

        System.out.println("\nMenor elemento de cada coluna:");
        for (j = 0; j < 7; j++) {
            System.out.print(menorColuna[j] + " ");
        }
    }
}
