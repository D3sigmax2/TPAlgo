package s02;
public class AmStramGram {
  public static void main(String[] args) {
    int n=4, k=2;
    if (args.length == 2) {
      n = Integer.parseInt(args[0]);
      k = Integer.parseInt(args[1]);
    }
    System.out.println("Winner is " + winnerAmStramGram(n, k));
  }
  // ----------------------------------------------------------  
  // "Josephus problem" with persons numbered 1..n
  // Removes every k-th persons (ie skip k-1 persons)
  // PRE: n>=1, k>=1
  // RETURNS: the survivor
  // Example: n=4, k=2: 
  //          '1234  => 1'234 => 1'(2)34 => 1'34
  //            1'34 => 13'4 => 13'(4) => 13'
  //             '13 => 1'3  => 1'(3) => 1'    ===> survivor: 1
  public static int winnerAmStramGram(int n, int k) {
    List     l = new List();
    ListItr li = new ListItr(l);
    int      i;

    // TODO - A COMPLETER !
    // ...                                 // build '-/-1-2-3-4-...-n-'
    // while(...) {                        // while size>1
    //   ...                               //   advance k times
    //   ...                               //   then remove an element
    // }
    // return ...                          // return the last one
    return 0; 
  }
  // ----------------------------------------------------------  
}
