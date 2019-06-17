package This.KeyWord;

public class asAnArgument_ConstructorCall_6 {

	B obj; 
    
    // Parameterized constructor with object of B  
    // as a parameter 
	asAnArgument_ConstructorCall_6(B obj) 
    { 
        this.obj = obj; 
         
     // calling display method of class B 
        obj.display(); 
    } 
      
} 
  
class B 
{ 
    int x = 5; 
      
    // Default Contructor that create a object of A  
    // with passing this as an argument in the  
   // constructor 
    B() 
    { 
   asAnArgument_ConstructorCall_6 obj = new asAnArgument_ConstructorCall_6(this); 
    } 
      
    // method to show value of x  
    void display() 
    { 
        System.out.println("Value of x in Class B : " + x); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B obj = new B(); 


	}

}
