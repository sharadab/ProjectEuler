import java.math.BigInteger;
public class P16 {

	public static void main(String[] args) {
		BigInteger number = BigInteger.valueOf(2).pow(1000);
		BigInteger sum = BigInteger.ZERO;
		while (number!=BigInteger.ZERO) {
			sum = sum.add(number.mod(BigInteger.valueOf(10)));
		}
		System.out.println(sum);

} }
