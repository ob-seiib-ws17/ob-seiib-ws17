class DifferenceGcd {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    while (m != n) {
      if (m > n) {
        m = m - n;
      } else {
        n = n - m;
      }
    }
    System.out.println(m);
  }
}
