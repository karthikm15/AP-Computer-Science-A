import kareltherobot.*;
import java.awt.Color;
public class emptyBeeperBag extends Robot
{
  public emptyBeeperBag (int street, int avenue, Direction direction, int beeper)
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
  public void pickingBeeper() {
    while (anyBeepersInBeeperBag()) {
        putBeeper();
    }
  }

  public static void main(String args[]) {
    emptyBeeperBag karel = new emptyBeeperBag(1, 1, East, 5);
    karel.pickingBeeper();
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
