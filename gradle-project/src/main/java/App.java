public class App {
  public static void main(String[] args) {

    boolean boo;

    boo = 5 < 7 && ! (7 < 9);

    boolean foo = boo;

    boolean booAndfoo = boo && foo;
    boolean booOrfoo = !(boo || foo);

    System.out.println(boo);
    System.out.println(foo);
    System.out.println(booAndfoo);
    System.out.println(booOrfoo);

    double a = -7.0;
    double b = 0;

    if (b != 0 && a / b > 0) {
      System.out.println("a / b > 0");
    } else {
      System.out.println("a / b <= 0" + (a/b) + 3);
    }

    int temperature = -12;
    boolean snow = temperature <= 0;

    if (!snow)
      System.out.println("Es schneit nicht!");

  }
}
