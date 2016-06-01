import java.util.*;

/*This class does all the functions needed for validating 
 * a credit card using the CreditCardTester class.
 */

public class CreditCard {
	
	/*Creating an constructor and object that
	 * can be used for many different credit 
	 * cards
	 */
	
	private int errorCode = 0;
	String creditCard;
	
	public CreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	/*Accessor Method*/
	
	public boolean isValid(){
		if(this.check() == true){
			return true;
		}else{
			return false;
		}
	}
	
	/*mutatator method that determines if credit
	 *card is valid or not, changes errorCode to 
	 *number corresponding to first test number failed
	 */
	
	public boolean check(){
		
		String number = this.creditCard;
		
		int total = sumOfAllDigits(number);
		int firstDigit = Character.digit(number.charAt(0), 11);
		int secondDigit = Character.digit(number.charAt(1), 11);
		int thirdDigit = Character.digit(number.charAt(2), 11);
		int fourthDigit = Character.digit(number.charAt(3), 11);
		int fifthDigit = Character.digit(number.charAt(4), 11);
		int sevenDigit = Character.digit(number.charAt(6), 11);
		int eightDigit = Character.digit(number.charAt(7), 11);
		int ninthDigit = Character.digit(number.charAt(8), 11);
		int sumOfFirstFour = firstDigit+secondDigit+thirdDigit+fourthDigit;
		int sumOfFirstTwo = firstDigit+secondDigit;
		int sumOfLastFour = lastFour(number);
		int sumOfSevenEight = sevenDigit + eightDigit;
		
		/*The 6 rules to verifying a credit card
		 * it will return a errorCode number corresponding
		 * to which validation was incorrect.
		 */
		if(firstDigit != 4){
			errorCode = 1;
			return false;
		}
		else if(fourthDigit < fifthDigit+1){
			errorCode = 2;
			return false;
		}
		else if(firstDigit*fifthDigit*ninthDigit != 24){
			errorCode = 3;
			return false;
		}
		else if(total%4 != 0){
			errorCode = 4;
			return false;
		}
		else if(sumOfFirstFour+1 !=  sumOfLastFour){
			errorCode = 5;
			return false;
		}
		else if(sumOfFirstTwo*10 + sumOfSevenEight*10  != 100){
			errorCode = 6;
			return false;
		}else{
			return true;
		}
	}
	
	/*Adds all the digits*/
	public int sumOfAllDigits(String creditCard){
		String creditN = this.creditCard;
		int result = 0;
		for(int i = 0; i<creditN.length(); i++){
			try{
				result += Character.digit(creditN.charAt(i), 11);
			}catch(Exception e){
				
			}
		}
		return result;
	}
	
	/*Adds up last four digits of credit card*/
	public static int lastFour(String creditCard){
		String str = creditCard;
			
		int twelveDigit = Character.digit(str.charAt(11), 11);
		int elevenDigit = Character.digit(str.charAt(10), 11);
		int tenDigit = Character.digit(str.charAt(9), 11);
		int nineDigit = Character.digit(str.charAt(8), 11);
			
		int sum = twelveDigit+elevenDigit+tenDigit+nineDigit;
		
		return sum;
	}
	
	/*Returns value of the variable errorCode
	 */
	
	public int getErrorCode(){
	
		return errorCode;
	}
}
