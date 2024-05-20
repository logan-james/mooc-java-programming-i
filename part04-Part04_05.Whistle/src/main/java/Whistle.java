public class Whistle {

  // Declaring private instance variable
  private String sound;

  // Constructor to initialize the instance variable
  public Whistle(String whistleSound) {
    this.sound = whistleSound;
  }

  // Method to print the whistle's sound
  public void sound() {
    System.out.println(this.sound);
  }

}