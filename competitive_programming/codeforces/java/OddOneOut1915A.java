import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOneOut1915A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Read the number of test cases
    int t = Integer.parseInt(br.readLine());

    // Loop for each test case
    for (int i = 0; i < t; i++) {
      String[] str_input = br.readLine().split("\\s+");

      int[] nums = new int[3];
      int j = 0;
      for (String str : str_input) {
        nums[j++] = Integer.parseInt(str);
      }

      int result = 0;
      for (int num : nums) {
        result ^= num;
      }

      System.out.println(result);
    }
  }
}
