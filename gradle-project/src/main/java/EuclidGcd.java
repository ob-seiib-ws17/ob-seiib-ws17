class EuclidGcd {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    int r = m % n;
    while (r != 0) {
      m = n;
      n = r;
      r = m % n;
    }
    System.out.println(n);
  }
}
