import java.util.Scanner;

public class PythagoreanAngles{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double x1=0;
		double y1=0;
		double x2=4;
		double y2=0;
		double x3=0;
		double y3=3;
		
		double a=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double c=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		double A=Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		double B=Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		double C=Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
		
		System.out.format("alpha = %.2f radians, %.1f degrees\n", Math.toRadians(B),B);
		System.out.format("beta = %.2f radians, %.1f degrees\n", Math.toRadians(C),C);
	}
}