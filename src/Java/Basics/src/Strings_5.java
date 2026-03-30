
public class Strings_5 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// What is String - String is an object with sequence of characters 
		
		// Two ways to create a string 
		
		
		// First method - String Literal 
		String s1 = "Aditya"; // s1 is creating an object with the value "Aditya" in the memory location 
 		String s2 = "Aditya"; // s2 will not create another object inside the memory it will point to the same object as s1 because both the string variable has the same value 
 		String s3 = "Vshk"; // This will create a new object inside the memory cuz different value 
 		
 		
 		// Second MEthod to create a string using new keyword 
 		// New keyword is used to create object 
 		
 		String v1 = new String("Welcome Home Adi"); // This will create a object inside the memory 
 		String v2 = new String("Welcome Home Adi"); // This will also create a new Object inside the memory location 
 		
 		// No matter here if it is a same String value it will still explicitly create a new object in the memory space 
 		
 	
 		
 		
 		// String methods 
 		
// 		String value1 = "Hello GoodMoring Aditya";
// 		
// 		String[] splittedString = value1.split(" ");
// 		
// 		for(int j=0;j<splittedString.length;j++){
//            System.out.println(splittedString[j]); 			
// 		} 
 		
 		
 		String value3 = "Hello GoodMorning Aditya"; 
 		String [] sa = value3.split("GoodMorning");
 		

 		
 		
 		for(int k=0;k<sa.length;k++) {
 			System.out.println(sa[k]);
 		}
 		
 		
 		
 		
 		
 		
// 		String [] value2 = {"Hi","there"};
// 		
// 		for (int i =0;i<value2.length;i++) {
// 			System.out.println(value2[i]);
// 		}
// 		
 		
	}

}
