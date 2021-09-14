public class Exercicio5 {
    
    public static void main(String[] args) {
	   
        float precoGasolina = 2.5f;
		float precoRefri = 2.0f;
		float litrosGasolina = 0.0f;
		int quantRefri = 0;
		float totalGasolina = 0.0f;
		float totalRefrigerante = 0.0f;
        float totalCompra = 0;

        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual é a quantidade de litros de gasolina?: ");
        litrosGasolina = ler.nextFloat();
        System.out.println("Qual é a quantidade de refrigerantes?: ");
        quantRefri = ler.nextInt();
        
        totalGasolina = precoGasolina * litrosGasolina;
        totalRefrigerante = precoRefri * quantRefri;
        
        totalCompra = totalGasolina + totalRefrigerante;
        
        System.out.println("Total a pagar = R$ " + totalCompra);
    }
}
