package baekjoon.silver.t2;

import java.util.Arrays;
import java.util.Scanner;

public class _1541 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    String[] nums = str.split("-");
    int sum = 0;
    for(int i = 0; i<nums.length; i++) {
      if(i == 0) {
        sum = mySum(nums[i]);
      }else {
        sum -= mySum(nums[i]);
      }
    }
    System.out.println(sum);
  }

  static int mySum(String num) {
    String[] nums = num.split("[+]");
    return Arrays.stream(nums)
            .mapToInt(Integer::parseInt)
            .sum();
  }
}
