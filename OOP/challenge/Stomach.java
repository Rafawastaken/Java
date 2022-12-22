public class Stomach extends Organ {
  private boolean is_empty;

  public Stomach(String name, String medical_condition, boolean is_empty) {
    super(name, medical_condition);
    this.is_empty = is_empty;
  }

  public void digest() {
    System.out.println("Digesting...");
  }

  @Override
  public void getDetails() {
    super.getDetails();

    if (this.is_empty) {
      System.out.println("Need to be fed");
    } else {
      System.out.println("Stomach is full!");
    }
  }

  public boolean isIs_empty() {
    return is_empty;
  }

  public void setIs_empty(boolean is_empty) {
    this.is_empty = is_empty;
  }
}
