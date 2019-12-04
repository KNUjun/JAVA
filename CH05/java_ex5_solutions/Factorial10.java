/* n! = n(n-1)(n-2)...1 */
/* can compute up to 23!
 * 20!    =     243290200817664 * 10000
 * 21!    =    5109094217170944 * 10000
 * 22!    =  112400072777760768 * 10000
 * 23!    = 2585201673888497664 * 10000
 * 2^63-1 = 9223372036854775807
 * 24!    = 
 */
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
import java.util.Scanner;

public class Factorial10 {
  public static void main(String[] args) {
    long fac;
    long pre_fac;
    int i,n;
    Scanner sc;

    // store how many 0's at the end
    int num10;

    sc = new Scanner(System.in);
    System.out.print("n? ");
    n = sc.nextInt();

    // initially number of 0's is 0
    num10 = 0;

    // start from fac = 0! = 1
    for (i=1, fac=1L; i<=n; i++) {
      pre_fac = fac;
      fac *= i;

      // check if overflowed
      if ( pre_fac != fac / i ) {
	System.out.println("Overflowed at " + i + "! = " + fac);
	System.out.println(i + "!/" + i + " = " + fac/i);
	System.out.println((i-1) + "! = " + pre_fac);
	fac = pre_fac;	// roll back to the previous, unoverflowed
	break;
      }

      // for the resulting factorial, remove trailing zeros
      // move trailing 0's to num10
      while ( fac % 10 == 0 ) { num10++; fac /= 10; }
    }

    //System.out.println((i-1) + "! = " + fac);
    System.out.print((i-1) + "! = " + fac);
    for (i=0; i<num10; i++) System.out.print('0');
    System.out.println("");
    System.out.println(" fac = " + fac + ", number of 0's = " + num10);
  }
}

/*
$ java Factorial10
n? 10
10! = 3628800   (fac = 36288, number of 0's = 2)
$ java Factorial10
n? 20
20! = 2432902008176640000   (fac = 243290200817664, number of 0's = 4)
$ java Factorial10
n? 22
22! = 1124000727777607680000   (fac = 112400072777760768, number of 0's = 4)
$ java Factorial10
n? 23
23! = 25852016738884976640000   (fac = 2585201673888497664, number of 0's = 4)
$ java Factorial10
n? 24
Overflowed at 24! = 6704607952195289088
23! = 25852016738884976640000   (fac = 2585201673888497664, number of 0's = 4)
*/

