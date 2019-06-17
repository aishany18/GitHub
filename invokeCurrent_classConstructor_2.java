package This.KeyWord;

public class invokeCurrent_classConstructor_2 {

	int a ;
	int b ;
   
	//Default constructor 
	invokeCurrent_classConstructor_2(){
		this ( 10, 20);
		System.out.println("Inside default constructor");
	}
    //Parameterized constructor 

	invokeCurrent_classConstructor_2(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Inside paramterized Constructor");
	}
	public static void main(String[] args) {
		invokeCurrent_classConstructor_2 object = new invokeCurrent_classConstructor_2();
	}
	
}
