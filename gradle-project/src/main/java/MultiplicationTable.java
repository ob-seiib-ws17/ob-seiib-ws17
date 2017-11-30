class MultiplicationTable {
  public static void main(String[] args) {
    int maximum = Integer.parseInt(args[0]);
    int zeile = 1;
    int spalte;
    while (zeile <= maximum) { // äußere Schleife
      spalte = 1;
      while (spalte <= maximum) { // innere Schleife
        // System.out.printf("%4d", zeile * spalte);
        // spalte = spalte + 1;
        System.out.println("Spalte = " + spalte++);
      }
      ++zeile;
      System.out.println();
    }
  }
}
