// LeeJunGi 2016117116 EncryptMult
import java.util.Scanner;

public class EncryptMult{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("If you want to exit, enter 'ctrl+z'\nKey r is only 3, 7, or 9");
		while (true){
			System.out.print("Encryption key r and numbers y1, y2 in that key: ");
			int r = sc.nextInt();
			// r is only 3 ,7 or 9
			if( (r!=3) && (r!=7) && (r!=9) ){
				System.out.println("Wrong key r");
				break;
			}
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int x1 = decrypt(y1, r);
			int x2 = decrypt(y2, r);
			int mult = x1*x2;
			
			int encryptMult = encrypt(mult, r);
			
			System.out.printf("%d (%d) * %d (%d) = %d * %d = %d = %d (%d)\n",
				y1, r, y2, r, x1, x2, mult, encryptMult, r);
		}
	}
	
	// encrypt and decrypt methods are recursive function
	static int encrypt(int x, int r){
		int y = (r*(x%10))%10;
		if((x/10)!=0)	return y + 10*encrypt((x/10),r);
		else return y;
	}
	// solving the modular arithmethic equation by using an arithmethic inverse
	static int decrypt(int y, int r){
		int arith_inverse=1; // default
		if(r==3) arith_inverse=7;
		else if(r==7) arith_inverse=3;
		else if(r==9) arith_inverse=9;
		
		int x = ((y%10)*arith_inverse)%10;
		if((y/10)!=0)	return x + 10*decrypt((y/10),r);
		else return x;
	}
}