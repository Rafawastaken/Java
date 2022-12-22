import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Patient patient = new Patient(
      "john",
      45,
      new Eye("Left eye", "cool", "blue", false),
      new Eye("Left eye", "cool", "blue", false),
      new Heart("Heart", "Great", 70),
      new Stomach("Stomach", "hard", false),
      new Skin("skin", "cool", "white", 40)
    );

    System.out.println("Name: " + patient.getName());
    System.out.println("Age: " + patient.getAge());

    Scanner scanner = new Scanner(System.in);

    boolean finish = false;

    while (!finish) {
      System.out.println(
        "Chose an organ: " +
        "\n\t1. Left eye" +
        "\n\t2. Right eye" +
        "\n\t3. Heart" +
        "\n\t4. Stomach" +
        "\n\t5. Skin" +
        "\n\t9. Quit"
      );

      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          patient.getLeftEye().getDetails();
          if (patient.getLeftEye().isIs_open()) {
            System.out.println("\t\t1. Close the eye");
            if (scanner.nextInt() == 1) {
              patient.getLeftEye().close();
            } else {
              continue;
            }
          } else {
            System.out.println("\t\t1. Open eye");
            if (scanner.nextInt() == 1) {
              patient.getLeftEye().open();
            } else {
              continue;
            }
          }
        case 2:
          patient.getRightEye().getDetails();
          if (patient.getRightEye().isIs_open()) {
            System.out.println("\t\t1. Close the eye");
            if (scanner.nextInt() == 1) {
              patient.getRightEye().close();
            } else {
              continue;
            }
          } else {
            System.out.println("\t\t1. Open eye");
            if (scanner.nextInt() == 1) {
              patient.getRightEye().open();
            } else {
              continue;
            }
          }
        case 3:
          patient.getHeart().getDetails();
          System.out.println("\t\t1. Change heart rate");
          if (scanner.nextInt() == 1) {
            System.out.println("New heart rate: ");
            patient.getHeart().setRate(scanner.nextInt());
            System.out.println("Heart rate changed to: " + scanner.nextInt());
          } else {
            continue;
          }
        // More of the same...
      }
    }
  }
}
