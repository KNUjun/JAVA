import java.util.Scanner;

public class CountWords{
	public static void main(String[] args){
		System.out.print("Enter a URL: ");
		String URLString = new Scanner(System.in).next();

		try{
			java.net.URL url = new java.net.URL(URLString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()){
				String line = input.next();
				String[] tokens = line.split("[ \t\n\n]");
				count += tokens.length;
			}
			
			System.out.println("The Count Words is " + count);
		}
		catch(java.net.MalformedURLException ex){
			System.out.println("Invalid URL");
		}
		catch(java.io.IOException ex){
			System.out.println("IO Errors");
		}
	}
}