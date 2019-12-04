// 2016117116, Lee JunGi, COMP217, Homework 2-3

public class ComplexMatrix extends GenericMatrix<Complex> {
  @Override /** Add two complex numbers */
  protected Complex add(Complex o1, Complex o2) {
    Complex temp = new Complex();
	temp.add(o1, o2);
	return temp;
  }

  @Override /** Multiply two complex numbers */
  protected Complex multiply(Complex o1, Complex o2) {
    Complex temp = new Complex();
	temp.mul(o1, o2);
	return temp;
  }

  @Override /** Specify zero for a complex number */
  protected Complex zero() {
    Complex temp = new Complex(0, 0);
	return temp;
  }

  @Override /** Returns string representation */
  protected String str(Complex o) {
    /* represents (1.0+2.0i), (1.0-2.0i), (-1.0+2.0i), or (-1.0-2.0i)
     * depending on the sign of Im()
     * this is the same as class Complex's toString, so you can reuse it */
    /* FILL */
	return o.toString();
  }
}
