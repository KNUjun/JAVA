public class CastingDemo2{
	public static void main(String[] args){
		display(new Circle(3.5));
		display(new Rectangle(4, 5));
		display(new Trapezoid(4, 5, 6));
		display(new Diamond(4, 5));
		display(new Ellipse(4, 5));
	}
	public static void display(Object obj){
		if( obj instanceof Circle) 
			System.out.println("Area of Circle: "+((Circle) obj).getArea());
		if( obj instanceof Rectangle)
			System.out.println("Area of Rectangle: "+((Rectangle) obj).getArea());
		if( obj instanceof Trapezoid)
			System.out.println("Area of Trapezoid: "+((Trapezoid) obj).getArea());
		if( obj instanceof Diamond)
			System.out.println("Area of Diamond: "+((Diamond) obj).getArea());
		if( obj instanceof Ellipse)
			System.out.println("Area of Ellipse: "+((Ellipse) obj).getArea());
	}
	
	static class Circle{
		double radius ;
		
		Circle(){ 
			this(0);
		} 
		Circle(double radius){
			this.radius = radius;
		}
		
		public double getArea(){
			return radius*radius*Math.PI;
		}
	}
	static class Rectangle{
		double width, height;
		
		Rectangle(){
			this(0,0);
		}
		Rectangle(double width, double height){
			this.width = width;
			this.height = height;
		}
		public double getArea(){
			return width*height;
		}
	}
	static class Trapezoid{
		double width1, width2, height;
		
		Trapezoid(){
			this(0, 0, 0);
		}
		Trapezoid(double width1, double width2, double height){
			this.width1 = width1;
			this.width2 = width2;
			this.height = height;
		}
		
		public double getArea(){
			return ((width1+width2)*height)/2.0;
		}
	}
	static class Diamond{
		double horizontal, vertical;
		
		Diamond(){
			this(0,0);
		}
		Diamond(double horizontal, double vertical){
			this.horizontal = horizontal;
			this.vertical = vertical;
		}
		
		public double getArea(){
			return (horizontal*vertical)/2.0;
		}
	}
	static class Ellipse{
		double a, b;
		
		Ellipse(){
			this(0,0);
		}
		Ellipse(double a, double b){
			this.a = a;
			this.b = b;
		}
		
		public double getArea(){
			return a*b*Math.PI;
		}
	}
}