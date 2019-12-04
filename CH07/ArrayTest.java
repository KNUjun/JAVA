public class ArrayTest {
  public static void main(String args[]) {

    // Array creation with initial values
    //int A[10] = {1,2,3,4,5,6,7};
    //int A1[10];
    //int A0[10] = {1,2,3,4,5,6,7};
    int A[] = {1,2,3,4,5,6,7};

    // Array creation 
    //double B[10];	// error
    double B[] = new double[10];

    for (int i=0; i<A.length; i++) 
      System.out.format("A[%d] = %d\n",i,A[i]);
    for (int i=0; i<B.length; i++) 
      System.out.format("B[%d] = %f\n",i,B[i]);
  }
}

