public class Ex44_RandomNumberGen{
	public static void main(String[] args){
		boolean nega18=false;
		boolean posi9=false;
		int count1=0, count2=0;
		for(int i=1;;i++){
			double num=Math.floor(-18+Math.random()*28);
			if (num==-18){
				System.out.println("Found -18 at "+i);
				if (nega18==false){
					count1=i;
					nega18=true;
				}
			}
			else if(num==9){
				System.out.println("Found 9 at "+i);
				if(posi9==false){
					count2=i;
					posi9=true;
				}
			}
			if(nega18&posi9==true)
				break;
		}
		System.out.println("The first appearance of -18 was at"+ count1);
		System.out.println("The first appearance of 9 was at"+ count2);
	}
}