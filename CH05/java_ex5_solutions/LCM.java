/*
$ java LCM
Least Common Multiple:
    |   20   21   22   23   24   25   26   27   28   29
----+--------------------------------------------------
 10 |   20  210  110  230  120   50  130  270  140  290
 11 |  220  231   22  253  264  275  286  297  308  319
 12 |   60   84  132  276   24  300  156  108   84  348
 13 |  260  273  286  299  312  325   26  351  364  377
 14 |  140   42  154  322  168  350  182  378   28  406
 15 |   60  105  330  345  120   75  390  135  420  435
 16 |   80  336  176  368   48  400  208  432  112  464
 17 |  340  357  374  391  408  425  442  459  476  493
 18 |  180  126  198  414   72  450  234   54  252  522
 19 |  380  399  418  437  456  475  494  513  532  551
*/

// source - https://futurists.tistory.com/42
public class LCM {
  public static void main(String[] args) {
    final int n1=10, n2=20, n3=30;
    int i, j;
    int larger, smaller, remainder;
    int lcm;

    System.out.println("Least Common Multiples:");
    System.out.format("    |");
    for (j=n2; j<n3; j++) System.out.format("%5d",j);
    System.out.println("");
    System.out.format("----+");
    for (j=n2; j<n3; j++) System.out.format("-----");
    System.out.println("");

    for (i=n1; i<n2; i++) {
      System.out.format("%3d |",i);
      for (j=n2; j<n3; j++) {
	// find GCD
	larger = j; smaller = i;
	while ( true ) {
	  remainder = larger % smaller;
	  if (remainder == 0) break;
	  else {
	    larger = smaller;
	    smaller = remainder;
	  }
	}

	// find LCM
	lcm = i*j/smaller;

	//System.out.println("LCM(" + i + "," + j + ") = " + lcm);
	System.out.format("%5d",lcm);
      }
      System.out.println("");
    }
  }
}
