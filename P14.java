
public class P14 {

	public static void main(String[] args) {
		
		//WHY IS THIS SO SLOW? IT DOESNT WORK!
		int maxLength = 0;
		int modifiedNumber= 0;
		
		for(int startingNumber = 2; startingNumber <= 1000000; startingNumber++) {
			int count = 1;
			modifiedNumber = startingNumber;
			
			while (modifiedNumber != 1) {
				if(modifiedNumber%2 == 0) {
					modifiedNumber = modifiedNumber / 2;
				}
				else {
					modifiedNumber = modifiedNumber * 3 + 1;
				}
				count++;
			}
			//System.out.println("CHECKING");
			if(count > maxLength) {
				maxLength = count;
			}
		}
		
		System.out.println(maxLength);
		//System.out.println("HELLO?");

	
	}
}
