public class ContaCorrente {

	private double saldo;

	public ContaCorrente(float saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente() {
		this.saldo = 0;
	}

	public void sacar(double saque) {
		if (this.saldo >= saque) {
      imprimirOperacao(1, saque);
			saldo -= saque;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void depositar(float deposito) {
    imprimirOperacao(2, deposito);
		this.saldo += deposito;
	}

	public void imprimirOperacao(int operacao, double valorOperacao) {
    String a = operacao == 1 ? "-" : "+";
		var novoSaldo = 0.0;
    
		if (operacao == 1) {
      
			novoSaldo = getSaldo() - valorOperacao;
      
		} else {
      
			novoSaldo = getSaldo() + valorOperacao;
      
		}
    
		System.out.println("Operação: " + getSaldo() + a + valorOperacao + " = " + novoSaldo);
    
	}

	public double getSaldo() {
		return saldo;
    
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
    
	}
}

public class aConta {
	public static void main(String[] args) {
		ContaCorrente operacao = new ContaCorrente(1800);

		opercao.sacar(50);
		operacao.depositar(500);
	}
}
