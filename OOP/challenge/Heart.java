public class Heart extends Organ {
  private int rate;

  public Heart(String name, String medical_condition, int rate) {
    super(name, medical_condition);
    this.rate = rate;
  }

  @Override
  public void getDetails() {
    super.getDetails();
    System.out.println("Heart Rate: " + this.getRate());
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }
}
