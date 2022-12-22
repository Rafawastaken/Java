public class Main {

  public static void main(String[] args) {
    // Engine engine = new Engine("renault", 8000);
    // Car bmw = new Car("m2", 4, "black", engine);
    Car bmw = new Car("m2", 4, "black", new Engine("renault", 8000));
    Engine engine_alt = bmw.getEngine();

    System.out.println(bmw.getName());
    System.out.println("Engine model: " + bmw.getEngine().getModel());
  }
}
