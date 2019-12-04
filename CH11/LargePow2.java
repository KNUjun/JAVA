import java.math.*;
import java.util.Scanner;

public class LargePow2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ? ");
		int n = sc.nextInt();
		System.out.println("2^" + n + " is \n" + pow2(n));
	}
	public static BigInteger pow2(long n){
		BigInteger result = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		for(int i=0; i<n; i++) result = result.multiply(two);
		return result;
	}
}