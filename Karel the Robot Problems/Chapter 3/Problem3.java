import kareltherobot.*;
import java.awt.Color;
public class farmer extends UrRobot
{
  public farmer (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public void TR()
  {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void getreadyR()
  {
    move();
    turnLeft();
    move();
    turnLeft();
  }
  public void getreadyL()
  {
    move();
    TR();
    move();
    TR();
  }
  public void movenpick()
  {
    move();
    pickBeeper();
  }
  public void harvestrow()
  {
    movenpick();
    movenpick();
    movenpick();
    movenpick();
    movenpick();
  }
  public void harvestrow2()
  {
    movenpick();
    movenpick();
    movenpick();
    movenpick();
  }
  public void get2rows()
  {
    harvestrow();
    getreadyL();
    harvestrow();
    getreadyR();
  }
  public void harvest()
  {
    get2rows();
    get2rows();
    harvestrow();
  }
  public static void main(String args[])
  {
    farmer potato = new farmer (1,2, North, 0);
    potato.harvest();
    potato.turnOff();
  }
  static {
    World.reset();
    World.readWorld("strawberry13.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}
