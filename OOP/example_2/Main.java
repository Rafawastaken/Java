public class Main {

  public static void main(String[] args) {
    Bird phoenix = new Bird("piu piu", "red", 2, false, 2);

    System.out.println(phoenix.getName());
    phoenix.eat("grain");
    System.out.println(phoenix.getWings());
    phoenix.fly(25);
  }
}
