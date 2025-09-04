import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        int contador=0, valor;
        double cubo, raiz;
        Scanner teclado = new Scanner(System.in);

        while (2>1) 
        {
            System.out.print("Digite um número (0 para parar): ");
            valor = teclado.nextInt();

            if (valor == 0)
            {
                break;
            }

            cubo = Math.pow(valor, 3);
            raiz = Math.sqrt(valor);
            contador++;

            if (contador % 20 == 1)
            {
                System.out.println("Valor\tCubo\tRaiz");
            }

            System.out.println(valor + "\t" + cubo + "\t" + raiz);
        }
    }
}
