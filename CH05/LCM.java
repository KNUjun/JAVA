public class LCM{
	public static int getGCD(int n1, int n2){ 
		int r, x, y;
		x= n1; y=n2;
		if(x<y){
			r=x;
			x=y;
			y=r;
		}
		while(y!=0){
			r=x%y;
			x=y;
			y=r;
		}
		return x;			
	}
	public static void main(String[] args){
		int i, j, gcd, lcm;
		//making matrix
		System.out.print("    |");
		for(i=20;i<30;i++)
			System.out.printf("%5d",i);
		System.out.println("\n----+----------------------------------------------------");
		
		for(i=10;i<20;i++){
			System.out.printf(" %d |",i);
			for(j=20;j<30;j++){
				gcd=getGCD(i,j);
				lcm=(i*j)/gcd;
				System.out.printf("%5d",lcm);
			}
			System.out.println();
		}
			
	}
}