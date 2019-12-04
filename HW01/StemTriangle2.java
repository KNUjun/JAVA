// LeeJunGi 2016117116 StemTriangle2
import java.util.Scanner;

public class StemTriangle2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Scale? (int) ");
		int N = sc.nextInt();
		final int LINES = 2*N+1;
		final int DOMAIN = 4*N+1;
		Character[][] tri2 = new Character[LINES][DOMAIN];
		int high, low, pos_O;
		
		//initializing	
		for(int i=0; i<LINES; i++){
			for(int j=0; j<DOMAIN; j++){
				if( i==N ) tri2[i][j] = '-';
				else tri2[i][j] = ' ';
			}
		}
		
		int[] y = new int[LINES]; // y-axis
		for(int i=0; i<LINES; i++)	y[i] = N-i;
		
		for(int j=0; j<DOMAIN; j++){
			low = N;
			high = 2*N - Math.abs(2*N-j);
			pos_O = high;
			if( high<low ){ // swap
				int temp = high;
				high = low;
				low = temp;
			}
			for(int i=0; i<LINES; i++){
				if( i==pos_O ) tri2[i][j] = 'O';
				if( (i<high) && (i>low) ) tri2[i][j] = '|';
			}
		}
		
		// printing
		for(int i=0; i<LINES; i++){
			System.out.printf("%+3d  ",y[i]);
			for(int j=0; j<DOMAIN; j++){
				System.out.print(tri2[i][j]);
			}
			System.out.println("");
		}
	}
}