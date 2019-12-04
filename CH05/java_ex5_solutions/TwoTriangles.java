import java.util.Scanner;

public class TwoTriangles {
  public static void main(String args[]) {
    int n;
    int x, y;
    int nlines;
    Scanner sc = new Scanner(System.in);

    System.out.print("How many lines? ");
    n = sc.nextInt();

    // print upper half
    nlines = (n+1)/2;	// even: n/2, odd: (n+1)/2
    for (y=1; y<=nlines; y++) {
      for (x=1; x<=y; x++) System.out.print("*");
      System.out.println();
    }

    // print lower half
    nlines = n/2;	// even: n/2, odd: (n-1)/2
    for (y=1; y<=nlines; y++) {
      if ( n % 2 != 0 ) System.out.print(" ");
      for (x=1; x<y; x++) System.out.print(" ");
      for (; x<=nlines; x++) System.out.print("*");
      System.out.println();
    }
  }
}

/*
$ java TwoTriangles 
How many lines? 5
*
**
***
 **
  *
$ java TwoTriangles 
How many lines? 6
*
**
***
***
 **
  *
$ java TwoTriangles 
How many lines? 7
*
**
***
****
 ***
  **
   *
$ java TwoTriangles 
How many lines? 8
*
**
***
****
****
 ***
  **
   *
$ java TwoTriangles 
How many lines? 9
*
**
***
****
*****
 ****
  ***
   **
    *
$ java TwoTriangles 
How many lines? 10
*
**
***
****
*****
*****
 ****
  ***
   **
    *
*/
