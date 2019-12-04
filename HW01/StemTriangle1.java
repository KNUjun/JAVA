// LeeJunGi 2016117116 StemTriangle1
import java.util.Scanner;

public class StemTriangle1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Scale? (int) ");
		int N = sc.nextInt();
		final int LINES = 2*N+1;
		final int DOMAIN = 4*N+1;
		Character[][] tri1 = new Character[LINES][DOMAIN];
		int high, low, pos_O;
		
		//initializing
		for(int i=0; i<LINES; i++){
			for(int j=0; j<DOMAIN; j++){
				if( i==N ) tri1[i][j] = '-';
				else tri1[i][j] = ' ';
			}
		}
		
		int[] y = new int[LINES]; // y-axis
		for(int i=0; i<LINES; i++)	y[i] = N-i;
		
		for(int j=0; j<DOMAIN; j++){
			if( j<=2*N ){
				low = Math.abs(N-j);
				high = N;
				pos_O = low;
			}
			else{
				low = N;
				high = 2*N - Math.abs(3*N-j);
				pos_O = high;
			}
			for(int i=0; i<LINES; i++){
				if( i==pos_O ) tri1[i][j] = 'O';
				if( (i<high) && (i>low) ) tri1[i][j] = '|';
			}
		}
		
		// printing
		for(int i=0; i<LINES; i++){
			System.out.printf("%+3d  ",y[i]);
			for(int j=0; j<DOMAIN; j++){
				System.out.print(tri1[i][j]);
			}
			System.out.println("");
		}
	}
}