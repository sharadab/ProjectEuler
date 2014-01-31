
public class P7 {
	public static void main(String args[]) {
		int count = 1;
		int number = 2;
		while(count<=10001) {
			if(isPrime(number)) {
				count++;
				if(count==10001) { System.out.println(number); }
			}
			number++;
		}
		//System.out.println(number);
	}
	
	public static boolean isPrime (int number) {
		//int number = 10000;
		if (number <= 1) {
            return false;
        }
        if (number == 2) {
        	return false;
        }
        if (number % 2 == 0) {
        	return false;
        }
        for (int i = 3; i <= Math.sqrt(number) + 1; i = i + 2) {
            if (number % i == 0) {
            	return false;
            }
        }
        return true;
        //System.out.println("true");
	}

}
