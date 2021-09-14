import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        float salario = 0;
        float percentual = 0.3f;
        float prestacao = 0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do salário: ");
        salario = ler.nextFloat();
        System.out.println("Digite o valor da prestação: ");
        prestacao = ler.nextFloat();

        if (prestacao <= (salario * percentual)){
            System.out.println("Empréstimo cedido");
        }
        else {
            System.out.println("Empréstimo negado");
        }
    }
}
