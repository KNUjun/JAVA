public class Ex43_math_exercises{
	public static void main(String[] args){
		double a = Math.atan(Math.sin((32/180.0)*Math.PI)*Math.cos((32/180.0)*Math.PI));
		double b = Math.pow(Math.exp(1.67)*Math.pow(1.65,Math.log(8)/Math.log(20)),0.25);
		double c = Math.log(35)*Math.log(21)/Math.log(7);
		double d = Math.exp(Math.sqrt(Math.log(4))+Math.sqrt(Math.log(5)));
		System.out.format("1 answer : %f\n2 answer : %f\n3 answer : %f\n4 answer : %f\n", a, b,c,d);
	}
}