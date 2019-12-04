public class TestShape{
	public static void main(String args[]){
		Point p = new Point(1,1);
		Shape[] arr = {
			new Rectangle(p,3,4),
			new Parallelogram(p,5,6,Math.PI/6.0),
			new Trapezoid(p,5,6,2)
		};
		System.out.println("SUM_AREA = " + sumArea(arr));
	}
	
	static double sumArea(Shape[] arr){
		double sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i].getArea();
		}
		return sum;
	}
}
	
class Point{
	double x, y;
	Point(){
		this(0,0);
	}
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "["+x+","+y+"]";
	}
}
	
abstract class Shape{
	private Point position;
	
	protected Shape(){
		this(new Point());
	}
	protected Shape(Point p){
		setPosition(p);
	}
	public Point getPosition(){
		return position;
	}
	public void setPosition(Point p){
		this.position = p;
	}
	
	public abstract double getArea();	
}

abstract class Quadrangle extends Shape{
	protected double width, height;
	
	protected Quadrangle(Point p, double w, double h){
		setPosition(p);
		setWidth(w);
		setHeight(h);
	}
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public void setWidth(double w){
		this.width = w;
	}
	public void setHeight(double h){
		this.height = h;
	}	
}

class Rectangle extends Quadrangle{
	public Rectangle(Point p, double w, double h){
		super(p, w, h);
	}
	public boolean isSquare(){
		if( this.width == this.height ) return true;
		else return false;
	}
	
	@Override
	public double getArea(){
		return getWidth()*getHeight();
	}
}

class Parallelogram extends Quadrangle{
	private double angle;
	
	public Parallelogram(Point p, double w, double h, double angle){
		super(p, w, h);
		setAngle(angle);
	}
	
	public double getAngle(){
		return this.angle;
	}
	public void setAngle(double a){
		this.angle = a;
	}
	
	@Override
	public double getArea(){
		return getWidth()*getHeight();
	}
}

class Trapezoid extends Quadrangle{
	private double top_width;
	
	public Trapezoid(Point p, double w, double h, double top_width){
		super(p, w, h);
		setTopWidth(top_width);
	}
	public double getTopWidth(){
		return this.top_width;
	}
	public void setTopWidth(double tw){
		this.top_width = tw;
	}
	@Override
	public double getArea(){
		return (getTopWidth()+getWidth())*getHeight()/2.0;
	}
}