//This class has hard-coded constants using a method that finds whether the value is prime or not. 
//True being prime false being not.
public class Prime {
	
	public static void main(String[] args) {
		//Use of method and print outputs
		System.out.println("2 " + checkInt(2) + ": this number is prime.");
		System.out.println("11 " + checkInt(11) + ": this number is prime.");
		System.out.println("19 " + checkInt(19) + ": this number is prime.");
		System.out.println("10 " + checkInt(10) + ": this number is not prime.");
		System.out.println("-4 " + checkInt(-4) + ": this number is not prime.");
		System.out.println("0 " + checkInt(0) + ": this number is not prime.");
	} 
		//Use of formula given in the method to find if prime is true
	public static boolean checkInt(int n){
		boolean prime = true;
			if(n<2){
				prime = false;
			} else { 
			for(int i = 2; i <= Math.sqrt(n); i++){
				if(n%i == 0){prime = false;}
				
			}
			
			}
		
			return prime;
		
	}
}	
	

