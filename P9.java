
public class P9 {

	public static void main(String[] args) {
		//int a = 1;
		//int b = 1;
		//int c = 1;
		
		int product = 0;
		for(int a = 1; a<=1000; a++) {
			for(int b=1; b<=1000;b++) {
				for(int c=1; c<=1000-a-b; c++) {
					if((a*a)+(b*b) == (c*c) && a+b+c==1000) {
						product = a*b*c;
						System.out.println(product);
					}
					
				}
			}
			
		}

	}

}
