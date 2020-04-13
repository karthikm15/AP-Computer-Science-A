import kareltherobot.*;
import java.awt.Color;
public class definitions extends UrRobot
{
  public definitions (int street, int avenue, Direction direction, int beeper)
  {
    super(street, avenue, direction, beeper);
  }
  public void two()
  {
    move();
    move();
  }
  public void four()
  {
    two();
    two();
  }
  public void twenty(){
    four();
    four();
    four();
    four();
    four();
  }
  public void onehundred(){
    twenty();
    twenty();
    twenty();
    twenty();
    twenty();
  }
  public void fivehundred(){
    onehundred();
    onehundred();
    onehundred();
    onehundred();
    onehundred();
  }
  public void onethousand(){
    fivehundred();
    fivehundred();
  }
  public void eight()
  {
    four();
    four();
  }
  public void moveBackwards()
  {
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
  }
  public static void main(String args[]) {
    definitions karel = new definitions(1, 1, North, 5);
    karel.onethousand(); //walking 1000 steps
    karel.eight(); // walking 8 steps(one mile)
    karel.moveBackwards(); // walking one step backwards
    karel.turnOff();
  }
  static {
    World.reset();
    World.readWorld("strawberry12.kwld");
    World.setBeeperColor(Color.magenta);
    World.setStreetColor(Color.blue);
    World.setNeutroniumColor(Color.green.darker());
    World.setDelay(0);
    World.setVisible(true);
  }
}
