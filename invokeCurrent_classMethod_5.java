package This.KeyWord;

public class invokeCurrent_classMethod_5 {

	void display() 
    { 
        // calling fuction show() 
        this.show(); 
     
       System.out.println("Inside display function"); 
    } 
      
    void show() { 
        System.out.println("Inside show funcion"); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeCurrent_classMethod_5 t1 = new invokeCurrent_classMethod_5(); 
        t1.display(); 
		
			  
		  
	}

}
