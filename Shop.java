package griffith;

public class Shop {

	
		private String name;
		private int type;
		private String number_of_staff;
		private int year_opened;
		

		// Empty constructor
		public Shop() {
			this.name = "";
		    this.type = "";
		    this.number_of_staff = 0;
		    this.year_opened = 0;
		    }

		// Two-argument constructor   
		public Shop(String name, int i) {
			this.name = name;
		    this.type = i;
		    this.number_of_staff = 0; // Default value
		    this.year_opened = 0;    // Default value
		    }

		// Full constructor
		public Shop(String name, int type, String string, int year_opened) {
			this.name = name;
		    this.type = type;
		    this.number_of_staff = string;
		    this.year_opened = year_opened;
		    }
		
		// Getter and setter for name
		public String getName() {
			return name;
		    }

		public void setName(String name) {
		    this.name = name;
		    }

		// Getter and setter for type   
		public int getType() {   
			return type;
		    }
	    
		public void setType(String type) {     
			this.type = type;
		    }
		    
		// Getter and setter for numberOfStaff   
		public int getnumber_of_staff() {
			return number_of_staff;
		    }

		public void setnumber_of_staff(int number_of_staff) {  
			this.number_of_staff = number_of_staff;
		    }
		    
		// Getter and setter for yearOpened	    
		public int getyear_opened() {
			return year_opened;
		    }
		    
		public void setyear_opened(int year_opened) {	        
			this.year_opened = year_opened;
		    }
		    
		// Method to print shop details    
		public void printDetails() {    
			System.out.println("Shop Name: " + name);	        
			System.out.println("Shop Type: " + type);       
			System.out.println("Number of Staff: " + number_of_staff);        
			System.out.println("Year Opened: " + year_opened);
		    }

		public int getstaff_count() {
			// TODO Auto-generated method stub
			return 0;
		}

		
		


}

