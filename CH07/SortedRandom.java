import java.util.Scanner;

public class SortedRandom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		while (true){
			System.out.print("n? ");
			n = sc.nextInt();
			if(n<=0) break;
			int[] myList = new int[n];

			for(int i = 0; i < myList.length ; i++){
				myList[i] = (int) ( Math.random()*9+1);
			}
			java.util.Arrays.sort(myList);
			for(int i = 0; i < myList.length ; i++){
				System.out.print(myList[i]+" ");
			}
			System.out.println("");
		}
	}
}