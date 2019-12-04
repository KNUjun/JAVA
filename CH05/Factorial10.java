import java.util.Scanner;

public class Factorial10{
	public static void main(String[] args){
		long fac, pre_fac;
		int i,n,num10=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("n? ");
		n=sc.nextInt();
		for(i=1, fac=1L; i<=n;i++){
			while((fac%10)==0){
				num10++;
				fac/=10;
			}
			pre_fac=fac;
			fac*=i;
			if(pre_fac!=fac/i){
				System.out.println("Overflowed! at "+i);
				fac=pre_fac;
				break;
			}
		}
		System.out.print(n+"! = "+fac);
		for(i=0;i<num10;i++)
			System.out.print("0");
		System.out.println(" (fac = "+fac+", num 10 = "+num10+")");
	}
}