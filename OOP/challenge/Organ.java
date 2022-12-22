public class Organ {
  private String name;
  private String medical_condition;

  public Organ(String name, String medical_condition) {
    this.name = name;
    this.medical_condition = medical_condition;
  }

  public void getDetails() {
    System.out.println("Name: " + this.getName());
    System.out.println("Medical Condition: " + this.getMedicalCondition());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMedicalCondition() {
    return medical_condition;
  }

  public void setMedicalCondtion(String medical_condition) {
    this.medical_condition = medical_condition;
  }
}
