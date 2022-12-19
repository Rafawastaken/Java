public class Animal {
  private String name;
  private String color;
  private int legs;
  private boolean has_tale;

  public Animal(String name, String color, int legs, boolean has_tale) {
    this.name = name;
    this.color = color;
    this.legs = legs;
    this.has_tale = has_tale;
  }

  public void eat(String food) {
    System.out.println("Eating: " + food);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getLegs() {
    return legs;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public boolean isHas_tale() {
    return has_tale;
  }

  public void setHas_tale(boolean has_tale) {
    this.has_tale = has_tale;
  }
}
