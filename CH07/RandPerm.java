import java.util.Scanner;

public class RandPerm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("n? ");
		int n = sc.nextInt();
		int[] myList = new int[n];
		boolean[] isGenerated = new boolean[n];
		for(int i = 0; i < myList.length ;){
			int r = (int) ( Math.random()*n+1);
			if(isGenerated[r-1]==false){
				isGenerated[r-1] = true;
				myList[i]=r;
				i++;
			}			
		}
		for(int i = 0; i < myList.length ; i++){
			System.out.print(myList[i] + " ");
		}
		System.out.println(""); // new line
	}
}