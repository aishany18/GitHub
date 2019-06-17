package This.KeyWord;

public class methodParameter_4 {
	 int a; 
	    int b; 
	      
	    // Default constructor 
	    methodParameter_4() 
	    { 
	        a = 10; 
	        b = 20; 
	    } 
	      
	    // Method that receives 'this' keyword as parameter 
	    void display(methodParameter_4 obj) 
	    { 
	        System.out.println("a = " + a + "  b = " + b); 
	    } 
	   
	    // Method that returns current class instance 
	    void get() 
	    { 
	        display(this); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	methodParameter_4 object = new methodParameter_4(); 
	        object.get(); 
	    } 

}
