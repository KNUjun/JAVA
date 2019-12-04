// 2016117116, Lee JunGi, COMP217, Homework 2-3

public abstract class GenericMatrix<E extends Number> {
  /** Abstract method for adding two elements of the matrices */
  protected abstract E add(E o1, E o2);

  /** Abstract method for multiplying two elements of the matrices */
  protected abstract E multiply(E o1, E o2);

  /** Abstract method for defining zero for the matrix element */
  protected abstract E zero();

  /** Abstract method for element string */
  protected abstract String str(E o);

  /** Add two matrices */
  public void addMatrix(
      E[][] result, E[][] matrix1, E[][] matrix2
      ) throws RuntimeException
  {
    // Check bounds of the three matrices
    if ( (result.length != matrix1.length) ||
	(result[0].length != matrix1[0].length) ||
	(matrix1.length != matrix2.length) ||
	(matrix1[0].length != matrix2[0].length) ) {

      throw new RuntimeException(
	  "The matrices do not have the same size: \n" + 
	  "[" + matrix1.length + " x " + matrix1[0].length + "]"
	  + "  " +
	  "[" + matrix2.length + " x " + matrix2[0].length + "]"
	  + "  " +
	  "[" + result.length + " x " + result[0].length + "]"
	  );
	}
	int col = matrix1[0].length;
	int row = matrix1.length;
	
    for(int r=0; r<row; r++){
		for(int c=0; c<col; c++){
			result[r][c] = this.add(matrix1[r][c], matrix2[r][c]);
		}
	}
  }

  public void multiplyMatrix(
      E[][] result, E[][] matrix1, E[][] matrix2
      ) throws RuntimeException
  {
    // Check bounds of the three matrices
    // matrix1: N1xM1, matrix2: N2xM2, result: N3xM3
    // M1 == N2, N3 == N1, M3 = M2
    if ( (matrix1[0].length != matrix2.length) ||
	(result.length != matrix1.length) ||
	(result[0].length != matrix2[0].length) ) {

      throw new RuntimeException(
	  "The matrices do not have compatible sizes: \n" +
	  "[" + matrix1.length + " x " + matrix1[0].length + "]"
	  + "  " +
	  "[" + matrix2.length + " x " + matrix2[0].length + "]"
	  + "  " +
	  "[" + result.length + " x " + result[0].length + "]"
	  );
	}
	
	int row1 = matrix1.length;
    int col1 = matrix1[0].length;
	int row2 = matrix2.length;
	int col2 = matrix2[0].length; 

	for(int r=0; r<row1; r++){
		for(int c=0; c<col2; c++){
			result[r][c] = this.zero();
			for(int x=0; x<row2; x++){
				result[r][c] = this.add(result[r][c], multiply(matrix1[r][x], matrix2[x][c]));
			}
		}
	}
  }

  /** Print matrices */
  /* this is already done, but you need to implement the method str()
   * in the concrete classes such as IntergerMatrix, DoubleMatrix,
   * and ComplexMatrix */
  public String toString(E[][] m1) {
    String s = new String("");
    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m1[0].length; j++)
	s = s + " " + str((E)m1[i][j]);
      s = s + "\n";
    }
    return s;
  }
}
