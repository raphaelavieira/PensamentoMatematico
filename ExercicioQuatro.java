import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
    
        float salario = 0;
        float aumento = 0.2f;
        float novoSalario = 0;
        String nome = "";

        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o salário: R$ ");
            salario = Float.parseFloat(ler.nextLine());

            if (salario <= 500){
                novoSalario = salario + (salario * aumento);
                System.out.println("O novo salário é: R$ " + novoSalario);
            }
            else {
                System.out.println("Valor não contemplado para aumento, pois é superior a R$500,00");
            }

            System.out.println("Tecle enter para continuar ou 'Não' para sair.");
            teclado = ler.nextLine();
            if (teclado.equalsIgnoreCase("Não")){
                System.exit(0);
            }
        }
    }
}
