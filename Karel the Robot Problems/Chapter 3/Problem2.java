import kareltherobot.*;
import java.awt.Color;
public class TwoWalker extends UrRobot
{
  public TwoWalker (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public void fastMove()
  {
    move();
    move();
    putBeeper();
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
  public void move3()
  {
    move();
    move();
    move();
  }

  public static void main(String args[]) {
    TwoWalker Karel = new TwoWalker (1, 5, North, 50);
    Karel.move();
    Karel.putBeeper();
    Karel.turnLeft();
    Karel.move3();
    Karel.TR();
    Karel.move();
    Karel.fastMove();
    Karel.TR();
    Karel.fastMove();
    Karel.fastMove();
    Karel.fastMove();
    Karel.TR();
    Karel.move();
    Karel.TR();
    Karel.move();
    Karel.putBeeper();
    Karel.fastMove();
    Karel.fastMove();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
    Karel.move();
    Karel.putBeeper();
    Karel.fastMove();
    Karel.turnLeft();
    Karel.move();
    Karel.move();
    Karel.move();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
  }
  static {
    World.reset();
    World.readWorld("pinebox.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
