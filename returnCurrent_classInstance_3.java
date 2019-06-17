package This.KeyWord;

public class returnCurrent_classInstance_3 {

	int a; 
    int b; 
  
    //Default constructor 
    returnCurrent_classInstance_3() 
    { 
        a = 10; 
        b = 20; 
    } 
      
    //Method that returns current class instance 
    returnCurrent_classInstance_3 get() 
    { 
        return this; 
    } 
      
    //Displaying value of variables a and b 
    void display() 
    { 
        System.out.println("a = " + a + "  b = " + b); 
    } 
  
    public static void main(String[] args) 
    { 
    	returnCurrent_classInstance_3 object = new returnCurrent_classInstance_3(); 
        object.get().display(); 
    } 
	}
	


