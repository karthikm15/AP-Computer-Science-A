import kareltherobot.*;
import java.awt.Color;
public class directions2 extends Robot
{
  public directions2 (int street, int avenue, Direction direction, int beeper)
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
  public void findNextDirection(){
    if (nextToABeeper()){
      pickBeeper();
      if (nextToABeeper()) {
            if (!facingSouth()){
                  turnLeft();
            }
            if (!facingSouth()){
                  turnLeft();
            }
            if (!facingSouth()){
                  turnLeft();
            }
            putBeeper();
      }
      else {
            if (!facingNorth()){
                  turnLeft();
            }
            if (!facingNorth()){
                  turnLeft();
            }
            if (!facingNorth()){
                  turnLeft();
            }
            putBeeper();
      }
    }
  }

  public static void main(String args[]) {
    directions2 karel = new directions2(5, 5, East, 5);
    karel.findNextDirection();
  }
  static {
    World.reset();
    World.readWorld("strawberry24.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(25);
    World.setVisible(true);
  }
}

