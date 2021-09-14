import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        int x = 1;
        int y = 1;
        int tabuada = 0;
        int contador = 0
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha a tabuada: ");
        
        x = ler.nextInt();
        
        for (contador <= 9) {
            tabuada = x * y;
            System.out.println(x + " x " + y + " = " + tabuada);
            y ++;
            contador += 1;
            }
        }
}

