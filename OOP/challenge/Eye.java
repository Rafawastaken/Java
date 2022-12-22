public class Eye extends Organ {
  String color;
  private boolean is_open;

  public Eye(
    String name,
    String medical_condition,
    String color,
    boolean is_open
  ) {
    super(name, medical_condition);
    this.color = color;
    this.is_open = is_open;
  }

  @Override
  public void getDetails() {
    super.getDetails();
    System.out.println("Color: " + this.getColor());
  }

  public void open() {
    this.is_open = true;
    System.out.println(this.getName() + " is open");
  }

  public void close() {
    this.is_open = false;
    System.out.println(this.getName() + " is closed");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isIs_open() {
    return is_open;
  }

  public void setIs_open(boolean is_open) {
    this.is_open = is_open;
  }
}
