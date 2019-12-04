import java.util.Scanner;

public class ToggleCases{
	public static void main(String[] args){
		System.out.print("Enter a URL: ");
		String URLString = new Scanner(System.in).next();
		
		try{
			java.net.URL url = new java.net.URL(URLString);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()){
				String line = input.nextLine();
				String toggle_line = toggle(line);
				System.out.println(toggle_line);
			}
		}
		catch(java.net.MalformedURLException ex){
			System.out.println("Invalid URL");
		}
		catch(java.io.IOException ex){
			System.out.println("IO Errors");
		}
	}
	public static String toggle(String line){
		String newLine = line;
		String result = "";
		for(int i=0; i<newLine.length(); i++){
			if( Character.isLowerCase(newLine.charAt(i)) )
				result += newLine.substring(i,i+1).toUpperCase();
			else if( Character.isUpperCase(newLine.charAt(i)) )
				result += newLine.substring(i,i+1).toLowerCase();
			else 
				result += newLine.substring(i,i+1);
		}
		
		return result;
	}
}