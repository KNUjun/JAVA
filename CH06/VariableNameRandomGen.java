import java.util.Scanner;
public class VariableNameRandomGen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Length of the variable? ");
		int n=sc.nextInt();
		int r, check=1; // ù��° ���ڷ� digit�� ������ �ʰ� ó������ r���ٰ� +1 ���ִ� �뵵
		
		for(int i=0; i<n; i++){
			r=(int)(Math.random()*5) + check; // r is between 0 and 5
			if (r==0){ // digit character
				System.out.print(getRandomDigitCharacter());
			}
			else if(r==1){ // upper case letter
				System.out.print(getRandomUpperCaseLetter());		
			}
			else if(r==2){ // lower case letter
				System.out.print(getRandomLowerCaseLetter());				
			}
			else if(r==3){ // '_'
				System.out.print('_');
			}
			else{ // '$'
				System.out.print('$');
			}
			check=0;
		}
	}
	public static char getRandomCharacter(char ch1, char ch2){
		return (char)(ch1 + Math.random()*(ch2-ch1+1));
	}
	public static char getRandomLowerCaseLetter(){
		return getRandomCharacter('a', 'z');
	}
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A','Z');
	}
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0','9');
	}
}