package AntiOedipalMachines;

/**
 * Bottom line of macroscopic neuronal activity. As far as I rememeber (I read
 * Anti-Oedipus some 3 years ago), there are several machines: a Desiring
 * Machine & Social Machine. In Thousand Plateaus, they talk about the War
 * machine, but that's a TODO for now
 */
public class Machine extends Thread {
  int speedOfProduction; // lets limit this number from 0-100. We can always go higher
  int product;
  String name;
  boolean started = false;

  public Machine(String machineName) {
    name = machineName;
  }

  public Machine(String machineName, int speed) {
    name = machineName;
    handleSpeed(speed);
  }

  public Machine(String machineName, int speed, boolean start) {
    name = machineName;
    handleSpeed(speed);
    if (start == true) {
      System.out.println("almost at bottom");

    }
  }

  private void handleSpeed(int speed) {
    if (speed > 100 || speed < 0) {
      System.out.print("False initialization of machine " + name);
      System.exit(1);
    } else {
      speedOfProduction = speed;
    }
  }

  // public void start() {
  // // we can let a thread continually generate product
  // System.out.print("In start");
  // if (!this.started) {
  // this.started = true;
  // Thread t1 = new Thread();
  // t1.start();
  // }
  // };

  public int assimilateProduct() {
    // need to somehow assimilate it into higher level subjective spaces
    return 0;
  }

  public void run() {
    boolean exit = false;
    while (exit) {
      if (product > 100) {
        System.out.println("Product has exceeded it's maximum capacity: not enough consumption of product");
        System.out.println("exiting program, awaiting further coding...");
        System.exit(1);

      } else {
        product += speedOfProduction;
        System.out.println("Product: " + product);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          exit = true;
          System.out.println("Production in Machine " + name + "has been halted.");
        }
      }
    }
  }
}
