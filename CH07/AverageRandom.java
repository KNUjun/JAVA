import java.util.Scanner;

public class AverageRandom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("n? ");
		int n = sc.nextInt();
		int[] myList = new int[n];
		int sum=0, count=0;
		double ave;
		for(int i = 0; i < myList.length ; i++){
			myList[i] = (int) ( Math.random()*9+1);
			System.out.print(myList[i] + " ");
			sum+=myList[i];
		}
		System.out.println(""); // new line
		ave= (double) sum / (double) n;
		System.out.println("Average = "+ave);
		for(int i = 0; i < myList.length ; i++){
			if((double)myList[i]>ave) count++;
		}
		System.out.println("Number of values above the average = "+ count);
	}
}