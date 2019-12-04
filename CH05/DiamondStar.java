import java.util.Scanner;

public class DiamondStar{
	public static void main(String[] args){
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many lines ?");
		n=sc.nextInt();
		
		for(i=1;i<=n/2;i++){
			for(j=1;j<=(n+1)/2-i;j++){
				System.out.print(" ");
			}			
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(i=1;i<=(n+1)/2;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(j=((n+1)/2)*2-i*2;j>=0;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
			
	}
}