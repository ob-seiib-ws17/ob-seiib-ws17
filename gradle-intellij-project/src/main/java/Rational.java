class Rational {
  int numer;
  int denom;


  void print() {
    System.out.printf("%d/%d%n", this.numer, this.denom);
  }

  void extend(final int x) {
    x = 3;
    numer *= x;
    denom *= x;
  }

}
