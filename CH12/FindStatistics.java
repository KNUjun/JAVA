import java.io.*;
import java.util.*;

public class FindStatistics{
	public static void main(String[] args) throws Exception{
		if( args.length!=2 ){
			System.out.println("Usage: java FindStatistics sourceFile targetFile");
		}
		
		// check if source file exists
		File sourceFile = new File(args[0]);
		if( !sourceFile.exists() ){
			System.out.println("Source file " + args[0] + "does not exist");
			System.exit(2);
		}
		
		// check  if target file exists
		File targetFile = new File(args[1]);
		if( targetFile.exists() ){
			System.out.println("Target file " + args[1] + " already exists");
			System.exit(3);
		}
		
		try(
			Scanner input = new Scanner(sourceFile);
			PrintWriter output = new PrintWriter(targetFile);
		){
			int size = input.nextInt();
			int[] arr = new int[size];
			int i = 0;
			int sum = 0;
			int max = 0;
			int min = size;
			while(input.hasNext()){
				int nextNum = input.nextInt();
				arr[i++] = nextNum;
				sum += nextNum;
				if( nextNum>max ) max = nextNum;
				else if( nextNum<min ) min = nextNum;
			}
			Arrays.sort(arr);
			output.println("Sum = " + sum);
			output.println("Average = " + (double)sum/(double)size);
			output.println("Maximum = " + max);
			output.println("Minimum = " + min);
			output.println("Sorted");
			for(i=size-1; i>=0; i--)
				output.print(arr[i] + " ");
		}
	}
}
		