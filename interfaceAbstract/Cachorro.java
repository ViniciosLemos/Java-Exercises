package interfaceAbstract;

public class Cachorro extends Canino implements Docil{

	  public void comer(){
	    System.out.printf("comeuuu");
	    
	  }
	  public void brincar(int petisco){
	    System.out.printf("Comeu "+ petisco + " petiscos\n");    
	 
	    
	  }
	  public void brincar(String bolinha){
	  
	    System.out.printf("Cachorro foi buscar Bolinha\n");    
	  
	}
	  public void serDocil(){
	    System.out.printf("cachorro sendo docil\n");
	    
	  }
	  
	}