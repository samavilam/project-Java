package griffith;

import java.util.ArrayList;
import java.util.List;

public class Test {


	public static void main(String[] args) {
		// Create a list of Shop objects
		List<Shop> shops = new ArrayList<>();

		// Initialize five different instances using different constructors
		Shop shop1 = new Shop(); // empty constructor
		Shop shop2 = new Shop("Bookstore", 2005); // two-argument constructor
		Shop shop3 = new Shop("Electronics", 2010, "Gadget Galaxy", 15); // full constructor
		Shop shop4 = new Shop(); // empty constructor
		Shop shop5 = new Shop("Clothing", 2018, "Fashion Trends", 8); // full constructor
 
		// Add the instances to the list      
		shops.add(shop1);       
		shops.add(shop2);   
		shops.add(shop3);       
		shops.add(shop4);      
		shops.add(shop5);
    
		// Print out the info for all Shops using their printDetails methods    
		System.out.println("Details before setting missing information:");   
		for (Shop shop : shops) {       
			shop.printDetails();
		}
      
		// For any shop missing a name and year opened, add them using setters    
		for (Shop shop : shops) {         
			if (shop.getName() == null || shop.getyear_opened() == 0) {         
				shop.setName("Default Name");       
				shop.setyear_opened(2000);      
			}      
		}

		       
		// Call the printDetails methods again to check it worked correctly   
		System.out.println("\nDetails after setting missing information:");       
		for (Shop shop : shops) {         
			shop.printDetails();      
		}
      
		// Use conditionals to print out the name of the store with the most and least staff       
		int mostStaff = Integer.MIN_VALUE;     
		int leastStaff = Integer.MAX_VALUE;     
		String mostStaffShop = "";     
		String leastStaffShop = "";      
		for (Shop shop : shops) {        
			int staffCount = shop.getstaff_count();     
			if (staffCount > mostStaff) {          
				mostStaff = staffCount;        
				mostStaffShop = shop.getName();   
			}        
			if (staffCount < leastStaff) {   
				leastStaff = staffCount;      
				leastStaffShop = shop.getName();     
			}     
		}
       
		System.out.println("\nStore with the most staff: " + mostStaffShop);        
		System.out.println("Store with the least staff: " + leastStaffShop);
       
		// Print out the names of any shops that have the same type        
		System.out.println("\nShops with the same type:");     
		for (int i = 0; i < shops.size() - 1; i++) {           
			for (int j = i + 1; j < shops.size(); j++) {       
				if (shops.get(i).getType().equals(shops.get(j).getType())) {
		                    System.out.println(shops.get(i).getName() + " and " 
		                    		+ shops.get(j).getName());
				}		            
			}	        
		}	    
	}	
}
