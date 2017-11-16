public class App {
  public static void main(String[] args) {
    // Argumente einlesen und umwandlen
    final int a =  Integer.parseInt(args[0]);
    final int b =  Integer.parseInt(args[1]);
    final int c =  Integer.parseInt(args[2]);

    // eigentliche Berechnung
    int max = a;

    if (b > max) {
      max = b;
      System.out.printf("Setze b");
    }

    if (c > max)
      max = c;

    // Ausgabe
    System.out.printf("max = %d%n", max);
  }
}
