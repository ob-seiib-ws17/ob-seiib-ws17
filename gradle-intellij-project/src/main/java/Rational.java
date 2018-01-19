class Rational {
  int numer;
  int denom;

  void print() {
    System.out.printf("%d/%d%n", this.numer, this.denom);
  }

  void extend(int x) {
    numer *= x;
    denom *= x;
  }

  void set(final int numer, final int denom) {
    this.numer = numer;
    this.denom = denom;
  }

  void setZero() {
    numer = 0;
    denom = 1;
  }

  void mult(final Rational that) {
    this.set(numer * that.numer, denom * that.denom);
  }

}
