import java.util.*;
public class DecimalToBinaryPR {
  static int convert(int n) {
   if(n == 0)
     return 0;
    else
      return convert(n/2)*10+ n%2;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter The Decimal number : );
    int n = in.nextInt();
    System.out.println(convert(n));
  }
}
