// LeeJunGi 2016117116 SimpleComplex
public class SimpleComplex{
	private double real;
	private double imag;
	
	public SimpleComplex(){
		set(0, 0);
	}
	public SimpleComplex(double re, double im){
		set(re, im);
	}
	public SimpleComplex(SimpleComplex other){
		set(other);
	}
	
	public double re(){
		return real; 
	}
	public double im(){
		return imag;
	}
	public double abs(){
		return Math.sqrt(Math.pow(real, 2)+Math.pow(imag, 2));
	}
	
	public void set(double re, double im){
		real = re;
		imag = im;
	}
	public void set(SimpleComplex a){
		set(a.re(), a.im());
	}
		
	//operators (rounding in the second decimal point)
	public void add(SimpleComplex a, SimpleComplex b){
		real = Math.round((a.re() + b.re())*10)/10.0;
		imag = Math.round((a.im() + b.im())*10)/10.0;
	}
	public void sub(SimpleComplex a, SimpleComplex b){
		real = Math.round((a.re() - b.re())*10)/10.0;
		imag = Math.round((a.im() - b.im())*10)/10.0;
	}
	public void mul(SimpleComplex a, SimpleComplex b){
		real = Math.round((a.re()*b.re() - a.im()*b.im())*10)/10.0;
		imag = Math.round((a.re()*b.im() + a.im()*b.re())*10)/10.0;
	}
	
	public String toString(){
		String str="(" + this.re();
		if( imag<0 )	str = str +  this.im() + "i)";
		else	str = str + "+" + this.im() + "i)";
		return str;
	}

	public boolean equals(SimpleComplex other){
		boolean bool_r = false;
		boolean bool_i = false;
		if( this.re() == other.re() ) bool_r = true;
		if( this.im() == other.im() ) bool_i = true;
		return (bool_r && bool_i);
	}
	public int compareTo(SimpleComplex o){
		if( this.abs() > o.abs() ) return 1;
		else if( this.abs() < o.abs() ) return -1;
		else return 0;
	}
}