package gestiontestjunit4;

public class Division extends Operations{
	
	public long division(long a, long b){
		if(b == 0){
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			return a/b;
		}
		
	}
	
	public long addition(long a, long b){
		if(b == 0){
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			return a+b;
		}
		
	}
	 
	 public long produit(long a, long b){
		if(b == 0){
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			return a*b;
		}
		
	}
	
	public long soustraction(long a, long b){
		if(b == 0){
			throw new IllegalArgumentException("La division par b = 0 est impossible");
		}else{
			return a-b;
		}
		
	}

}
