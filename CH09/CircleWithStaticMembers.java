public class CircleWithStaticMembers{
	double radius;
	
	// share to each intance
	static int numberOfObjects=0;
	
	CircleWithStaticMembers(){
		radius=1.0;
		numberOfObjects++;
	}
	CircleWithStaticMembers(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea(){
		return radius*radius*Math.PI;
	}
}