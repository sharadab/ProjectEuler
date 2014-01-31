public class P10 {

	public static void main(String[] args) {
		long sum = 2;
		for(int i=3; i<2000000; i=i+2) {
			if(isPrime(i)) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int number) {
		 if (number % 2 == 0) {
			 return false;
		 }
		 for(int i = 3; i*i <= number; i= i+2) {
		        if(number % i==0) {
		        	return false;
		        }
		           
	}
		 return true;
	}
}
