class App {
  public static void main(String[] args) {

    int i = 0;
    while (i < 10) {
      System.out.println(i);
      //continue;
      i += 2;
    }

    System.out.println(i);

    for (int j = 0; j < 10 ; j += 2) {
      if (j < 5) continue;
      System.out.println(j);
    }

    // System.out.println(j);
  }
}
