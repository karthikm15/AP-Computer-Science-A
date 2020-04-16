import kareltherobot.*;
import java.awt.Color;
public class leftClear extends Robot
{
  public leftClear (int street, int avenue, Direction direction, int beeper)
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
  public boolean leftIsClear()
  {
    turnLeft();
    if (frontIsClear()) {
      TR();
      return true;
    }
    TR();
    return false;
  }
  public static void main(String args[]) {
    leftClear karel = new leftClear(2, 4, South, 5);
    if (karel.leftIsClear()) {
      karel.putBeeper();
    }
  }
  static {
    World.reset();
    World.readWorld("strawberry23.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
