/*Criar uma classe pessoa com dados bancarios e instanciar no main e ver como os metodos correspondem*/

package ExerciceJavaConta;

public class Banco {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		
		p1.setnumConta(1818);
		p1.setDono("Vinicios");
		p1.abrirConta("CC");
		p1.depositar(50f);
		p1.sacar(100f);
		p1.fecharConta();
		System.out.println("Numero da conta a primeira pessoa: "+ p1.getnumConta());
		System.out.println("Nome do dono da primeira pessoa: "+ p1.getDono());
		System.out.println("Tipo: "+ p1.getTipo());
		System.out.println("Saldo R$ "+ p1.getSaldo());
		System.out.println("Status: "+ p1.getStatus());
		
		
		
		


	}

}
