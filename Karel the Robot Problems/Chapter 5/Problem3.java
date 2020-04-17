import kareltherobot.*;
import java.awt.Color;
public class directions extends Robot
{
  public directions (int street, int avenue, Direction direction, int beeper)
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
          pickBeeper();
          if (!facingSouth()){
                turnLeft();
          }
          if (!facingSouth()){
                turnLeft();
          }
          if (!facingSouth()){
                turnLeft();
          }
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
    }
  }
}
