package interfaceAbstract;

public class Canil {

	public static void main(String[] args) {
	    Cachorro dogao = new Cachorro();
	    CachorroRobo dogRobo = new CachorroRobo();
	   //Animal teste = new Animal(); nao da para instanciar pq � abstract
	   //Canino teste2 = new Canino(); abstract nao instancia
	    

	    dogao.brincar(2);
	    dogao.brincar("bolinha");
	  
	  //Animal teste3 = new Cachorro();
	    //teste3.brincar(); brincar nao existe em Animal
	    Docil teste4 = new Cachorro();
	    Docil teste5 = new CachorroRobo();

	    teste4.serDocil();
	    teste5.serDocil();

	     //teste4.latirDigitalmente(); O m�todo latirDigitalmente n�o est� definido  em docil
	    //teste5.latir(); Cachorro n�o tem o m�todo latir
	    
	    }
	}