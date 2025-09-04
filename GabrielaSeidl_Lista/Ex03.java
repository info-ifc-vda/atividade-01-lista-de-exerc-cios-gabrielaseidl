import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        int lado1, lado2, lado3, ang1, ang2, ang3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triângulo:");
        lado1 = teclado.nextInt();
        lado2 = teclado.nextInt();
        lado3 = teclado.nextInt();

        System.out.println("Digite os 3 ângulos do triângulo:");
        ang1 = teclado.nextInt();
        ang2 = teclado.nextInt();
        ang3 = teclado.nextInt();

        if (ang1 == 90 || ang2 == 90 || ang3 == 90)
        {
            System.out.println("Triângulo retângulo");
        }

        else if (ang1 > 90 || ang2 > 90 || ang3 > 90)
        {
            System.out.println("Triângulo obtusângulo");
        } 

        else
        {
            System.out.println("Triângulo acutângulo");
        }

        if (lado1 == lado2 && lado2 == lado3)
        {
            System.out.println("Triângulo equilátero");
        }
        
        else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
        {
            System.out.println("Triângulo escaleno");
        }
       else
        {
            System.out.println("Triângulo isósceles");
        }
    }
}