import kareltherobot.*;
import java.awt.Color;
public class surrounded extends Robot
{
  public surrounded (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public boolean turnOffIfSurrounded(){
    turnLeft();
    if (!frontIsClear()){
          turnLeft();
          if (!frontIsClear()) {
                turnLeft();
                if (!frontIsClear()) {
                    turnLeft();
                    if (!frontIsClear()) {
                          return true;
                    }
                }
          }
    }
    return false;
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

  public static void main(String args[]) {
    surrounded karel = new surrounded(5, 4, South, 5);
    if (karel.turnOffIfSurrounded()) {
      karel.turnOff();
    }
  }
  static {
    World.reset();
    World.readWorld("strawberry25.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
