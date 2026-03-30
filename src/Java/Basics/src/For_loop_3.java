
public class For_loop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {12,1,4,5,6,7,8};
		
		// Iterate this array using loop 
		
		
		// For loop 
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		// while Loop 
		int i=0;
		while(i<arr.length) {
			System.out.println(arr[i]+ "  ");
			i++;
		}
		System.out.println("FINISH-------------------------------");
		
		
		
		String [] value = {"aditya","Vshk","123","t"}; 
		
		int j = 0;
		while(j<value.length) {
			 System.out.println(value[j]);
			 j++;
		}
		
		
		
		// Short Form or alternate method to print array values 
		for(int k:arr) {
		System.out.println(k);
		}
		

	}

}
