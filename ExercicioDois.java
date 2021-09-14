package atividadepratica;

import java.util.Scanner;

public class ExercicioDois {
 
    public static void main(String[] args) {
        int numero;
        int contador = 1;

        Scanner ler = new Scanner(System.in);
        while (cont <= 10){
            System.out.print("Informe um número: ");
            numero = ler.nextInt();
            if (numero % 2 == 0){
                System.out.println("O número é par");
            }
            else {
                System.out.println("O número é ímpar");
            }
            contador += 1;
        }
    }
}
