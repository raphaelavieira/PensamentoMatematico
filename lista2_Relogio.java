package Relogio;


import java.util.Scanner;

public class Relogio {

	private int hora;
	private int minuto;

	public Relogio(int hora, int minuto) {
    
		this.hora = hora;
		this.min = minuto;

	}
	
	public void proximahora() {
    
		for (int i = 0; i == 24; i++) {
      
			System.out.println("Hora atual: " + i);
		}
	}

	public void proximoMinuto() {
		min += 1;
    
		if (min == 60) {
			hora += 1;
			min = 0;
      
			if (hora == 24) {
				hora = 0;
			}

		}

	}

	public void imprimir() {
    
		System.out.println(hora + ":" + minuto);

	}

	public void mudarHora() {
    
		Scanner teclado = new Scanner(System.in);
		System.out.println("Mude a hora = ");
		hora = teclado.nextInt();

		if (hora <= 24) {

			System.out.println("A hora é = " + hora);
		} else {
			System.out.println("Hora inválida");
		}
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
}
