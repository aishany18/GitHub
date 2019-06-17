package This.KeyWord;

////Java code for using 'this' keyword to 
//refer current class instance variables
public class currentClass_instanceVariable_1 {
	int a; 
    int b; 
      
    // Parameterized constructor 
    currentClass_instanceVariable_1(int a, int b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
    void display() 
    { 
        //Displaying value of variables a and b 
        System.out.println("a = " + a + "  b = " + b); 
    } 
  
    public static void main(String[] args) 
    { 
    	currentClass_instanceVariable_1 object = new currentClass_instanceVariable_1(10, 20); 
        object.display(); 
	}
	
}
