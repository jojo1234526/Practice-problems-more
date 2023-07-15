
public class Factorial {
	
	public static void main(String[] args) {
		//5! = 5*4*3*2*1 =120;
		System.out.println(factorials(5));

		System.out.println(factorial(5));
	}
	
	
	public static  int factorials(int n) {
		
		//this is our base case 
		// this base case needs to be satisfied in order to return something! 
		if(n==1) {
			System.out.println("factorial(" + n + ") = 1");
			return 1;
		}else {
			System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n-1) + ")");
			return n * factorials(n-1);

		}
	}   
	
	public static int factorial(int n) {
		int b = 0;
		for(int i= n-1; i>0; i--) {
			b=n*i;
			int c =b;
			n=c;	
			if(i==1) {
				return b;
			}
		}
		return 0;
	}
	


}
