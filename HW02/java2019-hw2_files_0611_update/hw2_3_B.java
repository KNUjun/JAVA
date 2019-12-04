public class hw2_3_B {
  static void IntegerMatrixTest() {
    // Create Integer arrays m1, m2
    Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
    Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
    Integer[][] rr = new Integer[m1.length][m1[0].length];

    // Create an instance of IntegerMatrix
    IntegerMatrix integerMatrix = new IntegerMatrix();

    System.out.println("m1 + m2 is ");
    integerMatrix.addMatrix(rr, m1, m2);
    System.out.println(integerMatrix.toString(rr));

    System.out.println("m1 * m2 is ");
    integerMatrix.multiplyMatrix(rr, m1, m2);
    System.out.println(integerMatrix.toString(rr));
  }

  static void DoubleMatrixTest() {
    // Create Double arrays m1, m2
    Double[][] m1 = new Double[][]{
      {0.1, -0.2, 1.3}, {1.4, 1.5, -0.6}, {1.1, 1.1, -0.1}};
    Double[][] m2 = new Double[][]{
      {-0.1, 0.1, -0.1}, {0.2, 1.2, 1.2}, {0.0, 1.0, 1.0}};
    Double[][] rr = new Double[m1.length][m1[0].length];

    // Create an instance of DoubleMatrix
    DoubleMatrix doubleMatrix = new DoubleMatrix();

    System.out.println("m1 + m2 is ");
    doubleMatrix.addMatrix(rr, m1, m2);
    System.out.println(doubleMatrix.toString(rr));
    //Double[][] rr = doubleMatrix.addMatrix(m1, m2);
    //System.out.println("m1 + m2 is " + rr);

    System.out.println("m1 * m2 is ");
    doubleMatrix.multiplyMatrix(rr, m1, m2);
    System.out.println(doubleMatrix.toString(rr));
  }

  static void ComplexMatrixTest() {
    // Create Complex arrays m1, m2
    final int nrows = 2;
    final int ncols = 3;
    Complex[][] m1 = new Complex[nrows][ncols];
    Complex[][] m2 = new Complex[nrows][ncols];
    Complex[][] m3 = new Complex[ncols][nrows];
    Complex[][] r1 = new Complex[nrows][ncols];
    Complex[][] r2 = new Complex[nrows][nrows];
    for (int i=0; i<m1.length; i++) {
      for (int j=0; j<m1[i].length; j++) {
	m1[i][j] = new Complex((double)i+1,(double)j+0.5);
	m2[i][j] = new Complex((double)j+1,(double)i+0.5);
	m3[j][i] = new Complex((double)i+1,(double)j+0.5);
      }
    }

    // Create an instance of ComplexMatrix
    ComplexMatrix complexMatrix = new ComplexMatrix();

    System.out.println("m1 + m2 is ");
    complexMatrix.addMatrix(r1, m1, m2);
    System.out.println(complexMatrix.toString(r1));

    System.out.println("m1 * m3 is ");
    complexMatrix.multiplyMatrix(r2, m1, m3);
    System.out.println(complexMatrix.toString(r2));
  }

  public static void main(String[] args) {
    IntegerMatrixTest();
    DoubleMatrixTest();
    ComplexMatrixTest();
  }
}
