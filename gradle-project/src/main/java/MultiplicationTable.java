class MultiplicationTable {
  public static void main(String[] args) {
    int maximum = Integer.parseInt(args[0]);
    int row = 1;
    int column;
    while (row <= maximum) { // äußere Schleife
      column = 1;
      while (column <= maximum) { // innere Schleife
        // System.out.printf("%4d", zeile * spalte);
        // spalte = spalte + 1;
        if (column == 3) {
          break;
        }
        System.out.println("Spalte = " + column++);
      }
      ++row;
      System.out.println();
    }
  }
}
