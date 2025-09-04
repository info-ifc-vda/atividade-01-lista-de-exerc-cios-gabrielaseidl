import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        int compra, pago, troco, qtd;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        compra = teclado.nextInt();

        System.out.print("Valor pago: ");
        pago = teclado.nextInt();

        troco = pago - compra;
        System.out.println("Troco: " + troco);

        qtd = troco / 100;
        troco = troco % 100;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 100");
        }

        qtd = troco / 50;
        troco = troco % 50;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 50");
        }

        qtd = troco / 20;
        troco = troco % 20;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 20");
        }

        qtd = troco / 10;
        troco = troco % 10;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 10");
        }

        qtd = troco / 5;
        troco = troco % 5;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 5");
        }

        qtd = troco / 2;
        troco = troco % 2;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 2");
        }

        qtd = troco / 1;
        troco = troco % 1;
        if (qtd > 0) 
        {
            System.out.println(qtd + " cédula(s) de 1");
        }
    }
}
