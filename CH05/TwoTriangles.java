import java.util.Scanner;

public class TwoTriangles{
	public static void main(String[] args){
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many lines ?");
		n=sc.nextInt();
		for(i=1;i<=n/2;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// print " "
		for(i=1;i<=(n+1)/2;i++){
			for(j=1;j<i;j++)
				System.out.print(" ");
			for(j=i;j<=(n+1)/2;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}