package leetcode.easy;

import java.math.BigInteger;

public class _67 {
  public static void main(String[] args) {
    String a1 = "11", b1 = "1",
            a2 = "1010", b2 = "1011";
    System.err.println(addBinary(a1, b1));
    System.err.println(addBinary(a2, b2));
  }

  public static String addBinary(String a, String b) {
    BigInteger a1 = new BigInteger(a, 2);
    BigInteger a2 = new BigInteger(b, 2);

    return a1.add(a2).toString(2);
  }
}
