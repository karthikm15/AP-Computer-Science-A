import kareltherobot.*;
import java.awt.Color;
public class GoToOrigin extends Robot
{
  public GoToOrigin (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public void TL()
  {
    turnLeft();
  }
  public void TR()
  {
    TL();
    TL();
    TL();
  }
  public void goingToOrigin() {
    while (!facingSouth()) {
        turnLeft();
    }
    while (frontIsClear()) {
        move();
    }
    TR();
    while (frontIsClear()) {
        move();
    }
    turnLeft();
    turnLeft();
  }

  public static void main(String args[]) {
    GoToOrigin karel = new GoToOrigin(2, 5, South, 5);
    karel.goingToOrigin();
    karel.turnOff();
  }
  static {
    World.reset();
    World.readWorld("strawberry34.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
