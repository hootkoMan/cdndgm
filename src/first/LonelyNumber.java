package first;

public class LonelyNumber {
  public int find(int[] input) {
    int[] units = new int[32];
    int result = 0;

    for (int number : input) {
      int mask = 1;
      for (int j = 0; j < 32; j++) {
        boolean hasBit = (number & mask) != 0;
        units[31 - j] += hasBit ? 1 : 0;
        mask <<= 1;
      }
    }

    for (int unit : units) {
      unit %= 5;
      result = result << 1;
      result += (unit & 1);
    }

    return result;
  }
}