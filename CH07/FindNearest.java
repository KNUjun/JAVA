public class FindNearest{
	public static void main(String[] args){
		double[][] pos={
			{-1,3},
			{-1,-1},
			{1,1},
			{2,0.5},
			{2,-1},
			{3,3},
			{4,2},
			{4,-0.5},
		};
		double min=1000;
		double[][] near = new double[2][2];
		for(int i=0;i<7;i++){
			for(int j=i+1;j<8;j++){
				double len=sqDistance(pos[i][0],pos[i][1],pos[j][0],pos[j][1]);
				if(len<min){
					min=len;
					near[0][0]=pos[i][0];
					near[0][1]=pos[i][1];
					near[1][0]=pos[j][0];
					near[1][1]=pos[j][1];
				}
			}
		}
		System.out.println("Nearest points : ("+near[0][0]+","+near[0][1]+") ("+near[1][0]+","+near[1][1]+")");
	}
	static double sqDistance(double x1, double y1, double x2, double y2){
		return ((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
}