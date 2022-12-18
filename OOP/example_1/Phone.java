package OOP.example_1;

public class Phone {
  private String name; // Private can only be used in current class
  private int camera; // Public or nothing can be used in project
  private int memory;

  // First Constructor
  public Phone(String name, int camera, int memory) {
    this.name = name;
    this.camera = camera;
    this.memory = memory;
  }

  // Second constructor
  public Phone(String name, int memory) {
    this.name = name;
    this.memory = memory;
  }

  // Public can be used in the project
  // Private can only be used in current class
  public void play_music(String track_name) {
    System.out.println("Currently playing: " + track_name);
  }

  // Set name
  public void setName(String name) {
    this.name = name;
  }

  // Retrive name
  public String getName() {
    return this.name;
  }

  // Set camera
  public void setCamera(int camera) {
    this.camera = camera;
  }

  // Get camera
  public int getCamera() {
    return this.camera;
  }

  // Set camera
  public void setMemory(int memory) {
    this.memory = memory;
  }

  // Get camera
  public int memory() {
    return this.memory;
  }
}
