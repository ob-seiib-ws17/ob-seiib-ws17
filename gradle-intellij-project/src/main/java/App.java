class App {
  public static void main(String[] args) {

    Rational a = new Rational();
    a.set(1,9);


    Rational b = new Rational();
    b.set(2,1);


    a.mult(b);


    // int x = ...

    // a.extend(x);

    a.print();

    a.setZero();

    // a.extend(2 * a.numer / (int) Math.sqrt(6)) ;

    // a.extend(1,2);

    a.extend(123 + 1);

    // a.extend(5);

    // System.out.printf("%d/%d%n", a.numer, a.denom);

//    Rational b = new Rational();
//    b.numer = 1;
//    b.denom = 90;
//
//    b.print();

    // System.out.printf("%d/%d%n", b.numer, a.denom);

  }
}
