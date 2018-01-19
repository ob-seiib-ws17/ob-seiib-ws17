class ChristmasTreeApp {
  public static void main(String[] args) {

    final int height = Integer.parseInt(args[0]);
    if (height > 2) {
      final ChristmasTree myTree = new ChristmasTree();
      myTree.height = height;
      myTree.print();
    } else {
      System.out.println("zu klein");
    }
  }
}
