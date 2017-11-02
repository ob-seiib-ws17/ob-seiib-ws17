/* Hier wird Hallo Welt ausgegeben. */
class HelloWorld {
  public static void main(String[] args) {
    int noOfCoffeeForToday;

    noOfCoffeeForToday = 5;
    // hier ist i 5

    System.out.println("Montag: " + noOfCoffeeForToday + " Kaffee");

    noOfCoffeeForToday = 7;    // ab hier ist i 7

    System.out.println("Dienstag: " + noOfCoffeeForToday + " Kaffee");

    System.out.println("Mittwoch: " + (noOfCoffeeForToday + noOfCoffeeForToday + 1) + " Kaffee");


  }
}
