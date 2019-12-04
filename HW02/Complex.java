// 2016117116, Lee JunGi, COMP217, Homework 2-2
public class Complex extends Number implements Comparable<Complex>{
	private double real;
	private double imag;
	
	public Complex(){
		set(0, 0);
	}
	public Complex(double re, double im){
		set(re, im);
	}
	public Complex(Complex other){
		set(other);
	}
	
	public double re(){
		return this.real; 
	}
	public double im(){
		return this.imag;
	}
	public double abs(){
		return Math.sqrt(Math.pow(real, 2)+Math.pow(imag, 2));
	}
	
	public void set(double re, double im){
		this.real = re;
		this.imag = im;
	}
	public void set(Complex a){
		set(a.re(), a.im());
	}
		
	//operators (rounding in the second decimal point)
	public void add(Complex a, Complex b){
		this.real = a.re() + b.re();
		this.imag = a.im() + b.im();
	}
	public void sub(Complex a, Complex b){
		this.real = a.re() - b.re();
		this.imag = a.im() - b.im();
	}
	public void mul(Complex a, Complex b){
		this.real = a.re()*b.re() - a.im()*b.im();
		this.imag = a.re()*b.im() + a.im()*b.re();
	}
	
	@Override
	public String toString(){
		String str="(" + String.format("%.1f",this.re());
		if( imag<0 )	str = str +  String.format("%.1f",this.im()) + "i)";
		else	str = str + "+" + String.format("%.1f",this.im()) + "i)";
		return str;
	}
	
	@Override
	public boolean equals(Object other){
		boolean bool_r = false;
		boolean bool_i = false;
		
		if(other instanceof Complex){
			if( this.re() == ((Complex) other).re() ) bool_r = true;
			if( this.im() == ((Complex) other).im() ) bool_i = true;
		}
		return (bool_r && bool_i);
	}
	
	@Override
	public int intValue(){
		return (int)this.doubleValue();
	}
	@Override
	public double doubleValue(){
		return this.abs();
	}
	@Override
	public long longValue(){
		return (long)this.doubleValue();
	}
	@Override
	public float floatValue(){
		return (float)this.doubleValue();
	}
	@Override
	public int compareTo(Complex o){
		if( this.abs() > o.abs() ) return 1;
		else if( this.abs() < o.abs() ) return -1;
		else return 0;
	}
}
