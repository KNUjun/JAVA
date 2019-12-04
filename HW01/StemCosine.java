// LeeJunGi 2016117116 StemCosine
import java.util.Scanner;

public class StemCosine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Scale? (int) ");
		int N = sc.nextInt();
		final int LINES = 2*N+1;
		final int DOMAIN = ((int)(Math.round(2*N*Math.PI))) + 1;
		Character[][] Cosine = new Character[LINES][DOMAIN];
		int cos, high, low, pos_O;
		
		//initializing
		for(int i=0; i<LINES; i++){
			for(int j=0; j<DOMAIN; j++){
				if( i==N ) Cosine[i][j] = '-';
				else Cosine[i][j] = ' ';
			}
		}
		
		int[] y = new int[LINES]; // y-axis
		for(int i=0; i<LINES; i++)	y[i] = N-i;
		
		for(int j=0; j<DOMAIN; j++){
			cos = (int) Math.round( N * Math.cos( j*( 1 / (double)N ) ) );
			if( cos >=0 ){
				low = N-cos;
				high = N;
				pos_O = low;
			}
			else{
				low = N;
				high = N-cos;
				pos_O = high;
			}
			for(int i=0; i<LINES; i++){
				if( i==pos_O ) Cosine[i][j] = 'O';
				if( (i<high) && (i>low) ) Cosine[i][j] = '|';
			}
		}
		
		// printing
		for(int i=0; i<LINES; i++){
			System.out.printf("%+3d  ",y[i]);
			for(int j=0; j<DOMAIN; j++){
				System.out.print(Cosine[i][j]);
			}
			System.out.println("");
		}
	}
}