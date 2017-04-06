package JUnit;

public class Calculation {
 int a;

public static void main (String args[])
{
	cube(6);
	dis();
	
}


 static void  dis()
 {
	 System.out.println("hi");
	 
 }
	public static int findMax(int arr[]){
		int max=0;
		//int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	
	public static int cube(int n){
		
		System.out.println(n);
		return n*n*n;
	}
	

		 public static Boolean validate(final Integer primeNumber) {
	      for (int i = 2; i < (primeNumber / 2); i++) {
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	      return true;
	   }
	 
}
