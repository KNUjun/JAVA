// 2016117116, Lee JunGi, COMP217, Homework 2-3

public class DoubleMatrix extends GenericMatrix<Double> {
  @Override /** Add two double numbers */
  protected Double add(Double o1, Double o2) {
    return o1+o2;
  }

  @Override /** Multiply two double numbers */
  protected Double multiply(Double o1, Double o2) {
    return o1*o2;
  }

  @Override /** Specify zero for a double number */
  protected Double zero() {
    return (double) 0;
  }

  @Override /** Returns string representation */
  protected String str(Double o) {
    /* 1 digit below decimal point, for example, 3.141592... -> 3.1 */
    /* hint: method String.format() */
    /* FILL */
	return String.format("%.1f", o);
  }
}
