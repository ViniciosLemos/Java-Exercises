package ExerciceJavaConta;

public class Pessoa {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public Pessoa() {
		this.setStatus(false);
		this.setSaldo(0.0f);
	}

	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(this.getTipo() =="CC") {
			this.setSaldo(50f);
			
		}else {
			this.setSaldo(150f);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("A conta tem dinheiro!!");
		}else if(this.getSaldo() < 0){
			System.out.println("Ta devendo, caloteiro");
		}else {
			this.setStatus(false);
		}
		
	}
	public void depositar(float v) {
		if(this.getStatus() == true) {
			this.setSaldo(this.getSaldo() + v);
		}else {
			System.out.println("A conta esta fechada, nao da para depositar!!");
		}
	
    }
	public void sacar(float valor) {
		if(this.getStatus() == true && this.getSaldo()>= valor){
			this.setSaldo(this.getSaldo() - valor);	
		}else {
			System.out.println("Impossivel sacar");
		}
    }
	
	public void pagarMensal() {
		if(this.getTipo() == "CC" && this.getStatus() == true && this.getSaldo()>12) {
			this.setSaldo(this.getSaldo() - 12);
			
		}else if (this.getTipo() == "CP" && this.getStatus() == true && this.getSaldo()>20) {
			this.setSaldo(this.getSaldo() - 20);
		}else {
			System.out.println("A conta nao existe!");
		}
	}
	
	public int getnumConta() {
		return this.numConta;
	}
	
	public void setnumConta(int m) {
		this.numConta = m;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String type) {
		this.tipo = type;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String proprietario) {
		this.dono = proprietario;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float saldoo) {
		this.saldo = saldoo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean statuss) {
		this.status = statuss;
	}
	
}
