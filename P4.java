import java.lang.StringBuilder;

public class P4 {
	public static void main (String[] args) {
		int max = 10000;
		for(int num1=100; num1<=999; num1++) {
			for(int num2 = 100; num2<=999; num2++) {
				int product = num1*num2;
				String productString = Integer.toString(product);
				if(isPalindrome(productString) && product>max) {
					//System.out.println(productString);
					max = product;
					System.out.println(max);
					break;
				}
				
			}
		}
	}
	
	public static boolean isPalindrome(String productString) {
		String reverse = new StringBuilder(productString).reverse().toString();
		if(reverse.equals(productString)) {
			return true;
		}
		return false;
	}

}
