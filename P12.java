
public class P12 {

	public static void main(String[] args) {
		int i = 1;
		int number = 0;
		while(NumberofDivisors(number) < 500) {
			number = number + i;
			i++;
			System.out.println(number);
		}
		
	}
	
	public static int NumberofDivisors(int number) {
		int numberOfDivisors = 0;
		int sqrt = (int)Math.sqrt(number);
		for(int i = 1; i < sqrt; i++) {
			if(number % i == 0) {
				numberOfDivisors = numberOfDivisors + 2; 
				//It's +2 instead of +1 because 
			}
		}
		if(sqrt*sqrt == number) {
			numberOfDivisors--;
		}
		return numberOfDivisors;
	}
		
		
		

}
