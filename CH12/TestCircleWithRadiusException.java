public class TestCircleWithRadiusException{
	public static void main(String[] args){
		try{
			CircleWithRadiusException c1 = new CircleWithRadiusException(-5);
			CircleWithRadiusException c2 = new CircleWithRadiusException(0);
			CircleWithRadiusException c3 = new CircleWithRadiusException(200);
		}
		catch(LessRadiusException ex1){
			System.out.println(ex1);
		}
		catch(LargeRadiusException ex2){
			System.out.println(ex2);
		}
		
		System.out.println("Number of objects created: " +
			CircleWithRadiusException.getNumberOfObjects());
	}
}

class LessRadiusException extends Exception {
	private double radius;
	
	public LessRadiusException(double radius){
		super("invalid radius " + radius);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
}
class LargeRadiusException extends Exception {
	private double radius;
	
	public LargeRadiusException(double radius){
		super("invalid radius " + radius);
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
}
class CircleWithRadiusException{
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithRadiusException() throws LessRadiusException, LargeRadiusException {
		this(1.0);
	}
	public CircleWithRadiusException(double newRadius) 
	throws LessRadiusException, LargeRadiusException {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	// catch exception
	public void setRadius(double newRadius) throws LessRadiusException, LargeRadiusException {
		if( newRadius<0 ) throw new LessRadiusException(newRadius);
		else if ( newRadius > 100 ) throw new LargeRadiusException(newRadius);
		else this.radius = newRadius;
	}	
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
}