package AntiOedipalMachines;

public class DesireMachine extends Machine {

  public DesireMachine(String name) {
    // just give me some standard machine
    super(name);
  }

  public DesireMachine(String name, int prod) {
    super(name, prod);
  }

  public DesireMachine(String name, int prod, boolean start) {
    super(name, prod, start);
    System.out.println("in here");
  }

  // public void start() {
  // super();
  // }
}
