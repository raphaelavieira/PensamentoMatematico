package atividadepratica;

import java.util.Scanner;

public class ExercicioUm {
   
    public static void main(String[] args) {
        
        float salario
        float percentualAumento
        float calculo
        float novoSalario
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do salário: R$ ");
        salario = ler.nextFloat();

        System.out.println("Informe o percentual de aumento: ");
        percentualAumento = ler.nextFloat();

        calculoAumento = (aumento/100) * salario;

        novoSalario = salario + calculoAumento;

        System.out.println("O aumento é R$ " + calculo);
        System.out.println("O novo salário é R$ " + novosalario);
    }

}
