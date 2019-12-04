import java.util.Scanner;

public class CountingSpaces{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num_spaces=0;
		System.out.print("Enter a line : ");
		String s= input.nextLine();
		
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)== ' ') num_spaces++;
		
		System.out.println("Number of spaces : "+num_spaces);
	}
}