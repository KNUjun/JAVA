// LeeJunGi 2016117116 ApproximatePISphere
import java.util.Scanner;
import java.util.Random;

public class ApproximatePISphere{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// if N_a <= 0, exit;
		System.out.println("***If you want to exit, enter non-positive integer***");
		while (true){
			System.out.print("How many samples to generate? ");
			int N_a = sc.nextInt();
			if(N_a <= 0) break;
			double[] sample = new double[3];
			int Ns = 0;
			Random rand = new Random(N_a);
			
			// generating random number in (-1,1)
			for(int i=0; i<N_a; i++){		
				sample[0] = (rand.nextDouble())*2-1.0; // x_pos
				sample[1] = (rand.nextDouble())*2-1.0; // y_pos
				sample[2] = (rand.nextDouble())*2-1.0; // z_pos
				if( distance(sample)<=1 ) Ns++;
			}
			double approx_pi = 6 * ((double)Ns / (double) N_a);
			double error = ( Math.abs(Math.PI-approx_pi)/Math.PI );
			System.out.printf("pi from %d samples = %f, error = %.3e\n", N_a, approx_pi, error);
		}
	}
	static double distance(double[] pos){
		return Math.sqrt(Math.pow(pos[0],2)+Math.pow(pos[1],2)+Math.pow(pos[2],2));
	}
}	