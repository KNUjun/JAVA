// LeeJunGi 2016117116 StemSine
import java.util.Scanner;

public class StemSine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Scale? (int) ");
		int N = sc.nextInt();
		final int LINES = 2*N+1;
		final int DOMAIN = ((int)(Math.round(2*N*Math.PI))) + 1;
		Character[][] Sine = new Character[LINES][DOMAIN];
		int sin, high, low, pos_O;
		
		//initializing
		for(int i=0; i<LINES; i++){
			for(int j=0; j<DOMAIN; j++){
				if( i==N ) Sine[i][j] = '-';
				else Sine[i][j] = ' ';
			}
		}
		
		int[] y = new int[LINES]; // y-axis
		for(int i=0; i<LINES; i++)	y[i] = N-i;
		
		for(int j=0; j<DOMAIN; j++){
			sin = (int) Math.round( N * Math.sin( j*( 1 / (double)N ) ) );
			if( sin >=0 ){
				low = N-sin;
				high = N;
				pos_O = low;
			}
			else{
				low = N;
				high = N-sin;
				pos_O = high;
			}
			for(int i=0; i<LINES; i++){
				if( i==pos_O ) Sine[i][j] = 'O';
				if( (i<high) && (i>low) ) Sine[i][j] = '|';
			}
		}
		
		// printing
		for(int i=0; i<LINES; i++){
			System.out.printf("%+3d  ",y[i]);
			for(int j=0; j<DOMAIN; j++){
				System.out.print(Sine[i][j]);
			}
			System.out.println("");
		}
	}
}