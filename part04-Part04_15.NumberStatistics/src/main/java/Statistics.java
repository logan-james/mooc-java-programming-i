
public class Statistics {
  private int count;
  private int sum;

  public Statistics() {
    // Initialize the count variable
    this.count = 0;
    this.sum = 0;
  }

  public void addNumber(int number) {
    // Increment the count each time a number is added
    this.count++;
    this.sum += number;
  }

  public int getCount() {
    // Return the count of numbers added
    return this.count;
  }

  public int sum() {
    // Return the sum of numbers added
    return this.sum;
  }

  public double average() {
    // Calculate and return the average of numbers added
    if (this.count == 0) {
      return 0;
    }
    return (double) this.sum / this.count;
  }
}
