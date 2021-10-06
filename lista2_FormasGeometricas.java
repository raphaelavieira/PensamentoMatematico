//Círculo

public class Circulo {
	public void area(float raio) {
		float cArea = 3.14f*(raio*raio);
		System.out.println("A área do círculo é: "+ calcArea + "cm^2");
	}
	
	public void perimetro(float raio) {
		float cPerimetro = 2*raio*3.14f;
		System.out.println("o perímetro do círculo é: " + calcPerimetro + "cm");
	}
	
}

//Quadrado

public class Retangulo {
	private int quadrado;
	
	public Retangulo(int quadrado) { 
		this.quadrado = quadrado;
	}
	
	public int quadrado() {
		return quadrado;
	}

	public void setQuadrado(int quadrado) {
		this.quadrado = quadrado;
	}

  //Retângulo
	public void Area(float ladoMenor, float ladoMaior) {
		float cArea = ladoMenor*ladoMaior;
		System.out.println("A área do retângulo é: "+ crea + "cm^2");
	}
	
	public void Perimetro(float ladoMenor, float ladoMaior) {
		float cPerimetro = (ladoMenor*2)+(ladoMaior*2);
		System.out.println("O perímetro do círculo é: "+ cPerimetro + "cm");
	}
}

//Métodos

public class Metodos {
	
  public void calcular (Retangulo x) {
		
    float cArea = x.getQuadrado()*x.getQuadrado();
		float cPerimetro = x.getQuadrado()*4;
		
    System.out.println("A área do quadrado é: "+ cArea +"cm^2");
		System.out.println("O perímetro do quadrado é: "+ cPerimetro +"cm");
		
    return;
    
	}
}
