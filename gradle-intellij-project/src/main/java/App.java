class App {
  public static void main(String[] args) {

    Rational a = new Rational();
    a.numer = 1;
    a.denom = 9;


    a.print();

    a.extend(2 * a.numer / (int) Math.sqrt(6)) ;

    a.extend(3);

    a.extend(123);

    a.extend(5);

    // System.out.printf("%d/%d%n", a.numer, a.denom);

//    Rational b = new Rational();
//    b.numer = 1;
//    b.denom = 90;
//
//    b.print();

    // System.out.printf("%d/%d%n", b.numer, a.denom);

  }
}
