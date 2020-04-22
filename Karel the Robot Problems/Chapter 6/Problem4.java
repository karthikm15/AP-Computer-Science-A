import kareltherobot.*;
import java.awt.Color;
public class ChooseWay extends Robot
{
  public ChooseWay (int street, int avenue, Direction direction, int beeper)
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
  public void ChoosingWay() {
    int x = 0;
    while (nextToABeeper()) {
        x++;
        pickBeeper();
    }

    if (x % 2 == 0) {
        TR();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }

    }
    else {
        TL();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }

    }
  }

  public static void main(String args[]) {
    ChooseWay karel = new ChooseWay(5, 5, North, 5);
    karel.ChoosingWay();
    karel.turnOff();
  }
  static {
    World.reset();
    World.readWorld("strawberry35.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}



