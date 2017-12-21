class App {
  public static void main(String[] args) {

    Rational a = new Rational();
    a.numer = 1;
    a.denom = 9;

    Rational b = a;

    Rational c = new Rational();
    c.numer = 1;
    c.denom = 9;

    if (a == b) {
      System.out.println("a ist gleich b");
    } else {
      System.out.println("a ist verschieden von b");
    }

    if (a.numer == c.numer && a.denom == c.denom) {
      System.out.println("a ist gleich c");
    } else {
      System.out.println("a ist verschieden von c");
    }

    int i = 7;
    int j = 7;

    if (i == j) {
      System.out.println("i ist gleich j");
    } else {
      System.out.println("i ist verschieden von j");
    }
    String help1 = "help";
    String help2 = "h";
    help2 = help2 + "elp";

    if (help1.equals(help2)) {
      System.out.println(help1 + " ist gleich " + help2);
    } else {
      System.out.println(help1 + " ist verschieden von " + help2);

    }
  }
}
