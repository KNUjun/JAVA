import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int n, i, j;
		int line, nprint;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many lines ?");
		n=sc.nextInt();
		
		//print upper half
		line= n/2;	// even : n/2 	odd : n/2 - 1 
		for(i=1;i<=line;i++){
			nprint=i*2-1; // 1, 3, 5, 7 ...
			for(j=1;j<=((n+1)/2)-i;j++) System.out.print(" ");
			for(j=1;j<=nprint;j++) System.out.print("*");
			System.out.println();
		}
		
		//print lower half
		line= (n+1)/2;	// even : n/2	odd : n/2 + 1
		for(i=1;i<=line;i++){
			nprint=line*2-i*2+1; 
			for(j=1;j<i;j++) System.out.print(" ");
			for(j=1;j<=nprint;j++) System.out.print("*");
			System.out.println();
		}
	}
}