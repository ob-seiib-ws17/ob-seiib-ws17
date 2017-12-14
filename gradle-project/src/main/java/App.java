class App {
  public static void main(String[] args) {

    int i = 5;

    Rational r = null;

    r = new Rational();

    i = 7;

    r.numer = 5;
    r.denom = 3;

    i = i + 2;

    i = r.numer + 5 * r.denom;

  }
}
