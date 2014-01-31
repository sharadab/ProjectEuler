
public class P5 {

	public static void main(String[] args) {
		for(int number = 1; number<1000000000; number++) {
			if(number%2==0 && number%3==0 && number%4==0 && number%5==0 && number%7==0 && number%8 == 0 && number%9==0 && number%11==0 && number%13==0 && number%17==0 && number%19==0) {
				System.out.println(number); 
			}
		}

	}

}
