
public class METHODS_DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		// Never write any methods inside the main block (here)
		
		
		METHODS_DEMO  d = new METHODS_DEMO();
		int ans = d.Sum_1(10, 2);
		System.out.println(ans);
		
		
		d.getData();
		
		
		// Using Static keyword
		System.out.println(Name_of_the_person("Tony","Stark"));
		
		
		
		
		// Calling Method from another class 
		Method_demo_2 E_O = new Method_demo_2();
		
		boolean value = E_O.Even_odd(9);
		System.out.println(value);
		
		
	}

	// Always write here you can write any methods here and this methods can be executed in some other class or files also 
	
	
	
	// If you are not returning anything then you will write void (printing something or executing some lines of code)
	public void getData() {
		
		System.out.println("Running my First Method which is get Data");
		
	}
	
	
	
	// If you are returning any Datatype then instead of void you write that datatype for EX:
	
	
	public int Sum_1(int a , int b) {
		
       return a+b;		
	}
	
	
	// Tf You are using Static keyword then you dont have to create an object to call any method inside this class 
	
	public static String Name_of_the_person(String First_name,String Second_name) {
		
		return First_name + Second_name;
		
	}	
	
	
}
