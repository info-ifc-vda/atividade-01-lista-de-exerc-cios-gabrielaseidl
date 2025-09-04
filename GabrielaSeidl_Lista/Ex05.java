import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        int jogadoresMenores, jogadores, acima80kg, idade, t, j, somaIdadesTime=0;
        double somaAlturas, peso, altura;
        Scanner teclado = new Scanner(System.in);

        jogadoresMenores = 0;
        somaAlturas = 0;
        jogadores = 5 * 11;
        acima80kg = 0;

        for (t = 1; t <= 5; t++) 
        {

            for (j = 1; j <= 11; j++) 
            {
                System.out.println("Time " + t + " - Jogador " + j);

                System.out.print("Idade: ");
                idade = teclado.nextInt();

                System.out.print("Peso: ");
                peso = teclado.nextDouble();

                System.out.print("Altura: ");
                altura = teclado.nextDouble();

                if (idade < 18) {
                    jogadoresMenores++;
                }
                if (peso > 80) {
                    acima80kg++;
                }

                somaIdadesTime = somaIdadesTime + idade;
                somaAlturas = somaAlturas + altura;
            }
            System.out.println("Média de idade do time " + t + ": " + (somaIdadesTime / 11.0));
        }

        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores);
        System.out.println("Média de altura do campeonato: " + (somaAlturas / jogadores));
        System.out.println("Porcentagem acima de 80kg: " + (acima80kg * 100.0 / jogadores) + "%");
    }
}
