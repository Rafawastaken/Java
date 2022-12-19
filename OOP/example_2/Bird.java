public class Bird extends Animal {
  private int wings;

  public Bird(
    String name,
    String color,
    int legs,
    boolean has_tale,
    int wings
  ) {
    super(name, color, legs, has_tale);
    this.wings = wings;
  }

  @Override
  public void eat(String food) {
    System.out.println("peaking food!");
  }

  public void fly() {
    System.out.println(this.getName() + " is flying away");
  }

  public void fly(int speed) {
    System.out.println("Flying at " + speed + " km/h");
  }

  public void fly(String name) {}

  public int getWings() {
    return wings;
  }

  public void setWings(int wings) {
    this.wings = wings;
  }
}
