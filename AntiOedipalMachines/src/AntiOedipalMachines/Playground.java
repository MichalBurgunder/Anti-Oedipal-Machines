package AntiOedipalMachines;

public class Playground extends Thread {
  int product = 0;

  public static void main(String[] args) {
    Playground thread = new Playground();
    thread.start();
    System.out.println("This code is outside of the thread");
  }

  public void run() {
    while (true) {
      if (product > 100) {
        try {
          throw new Exception("product has exceeded it's maximum: missing consumption of product");
        } catch (Exception exception) {
          exception.printStackTrace();
          System.out.println("exiting program, awaiting further coding...");
          System.exit(1);
        }
      } else {
        product++;
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      System.out.println("Product: " + product);
    }

  }
}