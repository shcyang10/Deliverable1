import java.util.Scanner;

public class Main {

	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		String eventType = new String();
	    String result = new String();
	    String mealType = new String();
	    String mealPrep = new String();
	    int partySize;
    	
	    
	    System.out.println("Enter the event type: ");
	    eventType = scan.nextLine();
	    
	    System.out.println("Enter the party size: ");
	    partySize = scan.nextInt();
	    scan.close();
	   	
		result = "If you host a " + eventType + " event for " + partySize + " guest, serving ";
		
		System.out.print(result);
		
	    if (eventType.contentEquals("casual")) {
			
	    	
	    	if (partySize == 1)
	    		mealType = mealType.concat("sandwiches");
	    }
	       
	    if (eventType.contentEquals("semi-formal")) {
	    	
	    	if (partySize >= 2)
				mealType = mealType.concat("fried chicken");
		}
		
		if (eventType.contentEquals("formal")) {
			
			if (partySize > 12)
				mealType = mealType.concat("chicken parmesan");
		}
		
	 
		 System.out.print(mealType);
		
		result = " would make you a favorble host. The best way to prepare the dinner would be ";
		
		 System.out.println(result);
	
	    if (partySize == 1) {
	    	mealPrep = mealPrep + "in the microwave.";
	    }
	    else if (partySize >= 2 && partySize <= 12) {
	    	mealPrep = mealPrep + "in your kitchen.";
	    }
	    else if (partySize > 12) {
	    	mealPrep = mealPrep + "by a caterer.";
	    }
	    
	    System.out.println(mealPrep); 
	}
}
