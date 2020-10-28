package AntiOedipalMachines;

public final class Main {
  public static void main(final String[] args) {
    // let's create a few machines
    Machine dM1 = new Machine("some Machine", 1, true);
    dM1.start();
    System.out.println("at end of main");
    while (true) {
      try {
        System.out.println("in sleep");
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        System.exit(0);
      }
    }
  }
}