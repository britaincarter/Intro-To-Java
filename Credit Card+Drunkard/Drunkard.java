import java.util.*;

/*This class simulates a drunk randomly walking from 
 * street to street.
 */
public class Drunkard {
	
	private int avenue;
	private int street;
	private int beginningAvenue;
	private int beginningStreet;
	
	public Drunkard(int avenue, int street) {
		this.avenue = avenue;
		this.street = street;
		beginningAvenue = avenue;
		beginningStreet = street;
	}
	
	/*moves drunk to next randomly chosen position*/

	public void step(){
		
			int xdirection = (int) (Math.random() * 4); 
		
			if(xdirection == 0){
				this.avenue = avenue + 1;
			}else if(xdirection == 1){
				this.avenue = avenue - 1;
			}else if(xdirection == 2){
				this.street = street + 1;
			}else if(xdirection == 3){
				this.street = street - 1;
			}
		
	}
	
	/*takes an integer as input (call it steps) and 
	 * moves the drunkard amount of "steps" of intersections 
	 * from his current location.
	 */
	public void fastForward(int steps){
		for(int i = 0; i<steps; i++){
			step();
		}
		
	}
	
	/*  Returns a String indicating the drunkard's
	 *  current location.
	 */
	
	public String getLocation(){
		String str = "Avenue: " + this.avenue + ", Street: " + this.street;
		return str;
	}
	
	/* Reports the drunkards distance in blocks from
	 * where he started calculated using the Manhattan
	 * distance metric. 
	 */	 
	public int howFar(){
		
		
		int ylocation = Math.abs(street) - Math.abs(beginningStreet); 
		int xlocation = Math.abs(avenue) - Math.abs(beginningAvenue);
		int totalDistance = xlocation + ylocation;
		return totalDistance;
	}

}
