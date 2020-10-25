package AntiOedipalMachines;

public class DesireMachine extends Machine {
  int productivity;

  public DesireMachine() {
    productivity = 20;
  }

  public DesireMachine(int prod) {
    if (prod < 0 || prod > 100) {
      throw new IllegalArgumentException(prod + " is out of range");
    }
    productivity = prod;
  }
}
