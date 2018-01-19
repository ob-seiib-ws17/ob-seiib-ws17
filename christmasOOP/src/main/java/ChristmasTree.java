class ChristmasTree {
    int height;

    void printNeedles() {
      for (int row = 0; row < height - 1; row++) {
        final int blanks = height - 2 - row;
        for (int i = 0; i < blanks; i++) {
          System.out.print(" ");
        }
        for (int i = 0; i < row * 2 + 1; i++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }

  void printTrunk() {
    final int trunkWidth = (height / 10 * 2) + 1;
    final int width = (height - 2) * 2 + 1;
    final int blanks = (width - trunkWidth) / 2;
    for (int i = 0; i < blanks; i++) {
      System.out.print(" ");
    }
    for (int i = 0; i < trunkWidth; i++) {
      System.out.print("I");
    }
    System.out.println();
  }

  void print() {
    printNeedles();
    printTrunk();
  }
}
