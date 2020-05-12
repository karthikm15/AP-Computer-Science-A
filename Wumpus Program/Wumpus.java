import java.util.*;
import java.io.*;
public class Main {
public static void main(String args[]) throws java.io.FileNotFoundException
{
  File caves = new File("code.txt");
  Scanner userinput = new Scanner(System.in);
  Scanner fileinput = new Scanner(caves);
  Random random = new Random();
  System.out.println();
  System.out.println("You want to explore the caves and destroy the \r\n" +
  "and destroy the wumpi without getting killed in the process \r\n" +
  "If you want to move to an adjacent cave, press 'M' and then the \r\n" + 
  "the tunnel number. To toss a grenade, enter 'T' and the tunnel number.");
  boolean stillalive = true;
  int curcave=0;
  int numwumpi=0;
  int grenades;
  List<Integer> adj1 = new ArrayList<>();
  List<Integer> adj2 = new ArrayList<>();
  List<Integer> adj3 = new ArrayList<>();
  List<String> name = new ArrayList<>();
  List<Boolean> known = new ArrayList<>();
  List<Integer> danger = new ArrayList<>(); //0 for nothing, 1 for bat, 2 for pit, 3 for wumpus
  int numcaves = fileinput.nextInt();
  for (int i=0; i<numcaves; i++)
  {
    int temp1, temp2, temp3, temp4, temp6;
    String temp5;
    temp1 = fileinput.nextInt();
    temp2 = fileinput.nextInt();
    temp3 = fileinput.nextInt();
    temp4 = fileinput.nextInt();
    temp5 = fileinput.nextLine();
    temp6 = random.nextInt(100);
    adj1.add(temp2);
    adj2.add(temp3);
    adj3.add(temp4);
    name.add(temp5);
    known.add(false);
    if (temp6<=50 || temp1==0)
    {
      danger.add(0); //nothing
    }
    else if (temp6>50 && temp6<=70)
    {
      danger.add(1); //bat
    }
    else if (temp6>70 && temp6<=90)
    {
      danger.add(2); //pit
    }
    else if (temp6>90)
    {
      danger.add(3); //wumpus
      numwumpi++;
    }
  }
  grenades=numwumpi*4;
  while (numwumpi>0 && stillalive)
  {
    boolean feel=false;
    boolean smell=false;
    boolean hear=false;
    known.set(curcave, true);
    if (danger.get(adj1.get(curcave))==1)
    {
      hear = true;
    }
    else if (danger.get(adj2.get(curcave))==1)
    {
      hear = true;
    }
    else if (danger.get(adj3.get(curcave))==1)
    {
      hear = true;
    }
    if (danger.get(adj1.get(curcave))==2)
    {
      feel = true;
    }
    else if (danger.get(adj2.get(curcave))==2)
    {
      feel = true;
    }
    else if (danger.get(adj3.get(curcave))==2)
   {
      feel = true;
    }
    if (danger.get(adj1.get(curcave))==3)
    {
      smell = true;
    }
    else if (danger.get(adj2.get(curcave))==3)
    {
      smell = true;
    }
    else if (danger.get(adj3.get(curcave))==3)
   {
      smell = true;
    }
    System.out.println("You are in" + name.get(curcave));
    System.out.println("You have " + grenades + " grenades.");
    if (hear)
    {
    System.out.println("There is a noise in an adjacent cave.");
    }
    else
   {
    System.out.println("You don't hear anything.");
    }
    if (feel)
   {
      System.out.println("You feel something close in an adjacent cave.");
    }
    else
    {
      System.out.println("You do not feel anything.");
    }
    if (smell)
    {
      System.out.println("You smell something in an adjacent cave.");
    }
    else
    {
      System.out.println("You don't smell anything.");
    }
    if (!known.get(adj1.get(curcave)))
    {
      System.out.println("1. Unknown");
    }
    else
    {
      System.out.println("1. " + name.get(adj1.get(curcave)));
    }
    if (!known.get(adj2.get(curcave)))
   {
      System.out.println("2. Unknown");
    }
    else
    {
      System.out.println("2. " + name.get(adj2.get(curcave)));
   }
    if (!known.get(adj3.get(curcave)))
   {
      System.out.println("3. Unknown");
    }
    else
    {
      System.out.println("3. " + name.get(adj3.get(curcave)));
    }
    System.out.println();
    System.out.println("What is your next step?");
    String input = userinput.nextLine();
    input.toUpperCase();
    while (true)
    {
    if (input=="M" || input.charAt(0)=='M')
      {
      break;
    }
    if (input=="T" || input.charAt(0)=='T')
    {
      break;
    }
    System.out.println("That is not one of the choices. Please try again.");
    System.out.println();
    System.out.println("What is your next step?");
    input = userinput.nextLine();
    input.toUpperCase();
    }
    if (input=="M" || input.charAt(0)=='M')
    {
      System.out.println("You want to move to another cave.");
      System.out.println("To rechoose, press 0. Otherwise, press 1, 2, or 3 \r\n" + "to move to that cave.");
      input = userinput.nextLine();
      input.toUpperCase();
      if (input.charAt(0)=='0')
      {
        continue;
      }
      else
      {
        if (input.charAt(0)=='1')
        {
          curcave = adj1.get(curcave);
        }
        else if (input.charAt(0)=='2')
        {
          curcave = adj2.get(curcave);
        }
        else if (input.charAt(0)=='3')
        {
          curcave = adj3.get(curcave);
        }
        if (danger.get(curcave)==1)
        {
          System.out.println("You have been transported to another cave by a bat.");
          curcave = random.nextInt(numcaves);
          while (danger.get(curcave)!=0)
          {
              curcave = random.nextInt(numcaves);
          }
        }
      else if (danger.get(curcave)==2)
      {
          System.out.println("YOU FELL INTO A PIT!!");
          stillalive=false;
      }
      else if (danger.get(curcave)==3)
     {
        System.out.println("YOU WERE KILLED BY A WUMPUS!!");
        stillalive=false;
      }
    }
  }
  else if (input=="T" || input.charAt(0)=='T')
  {
    System.out.println("You choose to throw a grenade.");
    System.out.println("To rechoose, press 0. Otherwise, press 1, 2, or 3 \r\n" + "to throw in that cave.");
    if (grenades==0)
    {
      System.out.println("There are no more grenades left in your bag.");
      continue;
    }
    input = userinput.nextLine();
    if (input.charAt(0)=='0')
    {
      continue;
    }
    else
    {
      grenades--;
      int throwind=0;
      if (input.charAt(0)=='1')
      {
        throwind = adj1.get(curcave);
      }
      else if (input.charAt(0)=='2')
      {
        throwind = adj2.get(curcave);
      }
      else if (input.charAt(0)=='3')
      {
        throwind = adj3.get(curcave);
      }
      if (danger.get(throwind)==3)
      {
        System.out.println("YOU KILLED A WUMPUS!");
        danger.set(throwind, 0);
        numwumpi--;
      }
      else
      {
        System.out.println("You missed!");
        if (danger.get(adj1.get(curcave))==3)
        {
          int wumpiind = adj1.get(curcave);
          int nextcave=random.nextInt(3);
          boolean cave1=false;
          boolean cave2=false;
          boolean cave3=false;
          while (!cave1 || !cave2 || !cave3)
          {
            if (nextcave==0)
            {
              if (danger.get(adj1.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj1.get(wumpiind), 3);
                wumpiind=adj1.get(wumpiind);
                break;
              }
              else
              {
                cave1=true;
              }
            }
            if (nextcave==1)
            {
              if (danger.get(adj2.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj2.get(wumpiind), 3);
                wumpiind=adj2.get(wumpiind);
                break;
              }
              else
              {
                cave2=true;
              }
            }
            if (nextcave==2)
              {
                if (danger.get(adj3.get(wumpiind))==0)
                {
                  danger.set(wumpiind, 0);
                  danger.set(adj3.get(wumpiind), 3);
                   wumpiind=adj3.get(wumpiind);
                  break;
                }
                else
                {
                  cave3=true;
                }
              }
            }
            if (wumpiind==curcave)
            {
              stillalive=false;
              System.out.println("The wumpus ran into your cave and KILLED YOU!");
            }
          }
          else if (danger.get(adj2.get(curcave))==3)
          {
            int wumpiind = adj2.get(curcave);
            int nextcave=random.nextInt(3);
            boolean cave1=false;
            boolean cave2=false;
            boolean cave3=false;
            while (!cave1 || !cave2 || !cave3)
            {
              if (nextcave==0)
              {
                if (danger.get(adj1.get(wumpiind))==0)
                {     
                  danger.set(wumpiind, 0);
                  danger.set(adj1.get(wumpiind), 3);
                  wumpiind=adj1.get(wumpiind);
                  break;
                }
              else
              {
                cave1=true;
              }
            }
            if (nextcave==1)
            {
              if (danger.get(adj2.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj2.get(wumpiind), 3);
                wumpiind=adj2.get(wumpiind);
                break;
              }
              else
              {
              cave2=true;
              }
            }
            if (nextcave==2)
            {
              if (danger.get(adj3.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj3.get(wumpiind), 3);
                wumpiind=adj3.get(wumpiind);
                break;
              }
              else
              { 
                cave3=true;
              }
            }
          }
          if (wumpiind==curcave)
          {
            stillalive=false;
            System.out.println("The wumpus ran into your cave and KILLED YOU!");
          }
        }
        else if (danger.get(adj3.get(curcave))==3)
        {
          int wumpiind = adj3.get(curcave);
          int nextcave=random.nextInt(3);
          boolean cave1=false;
          boolean cave2=false;
          boolean cave3=false;
          while (!cave1 || !cave2 || !cave3)
          {
            if (nextcave==0)
            {
              if (danger.get(adj1.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj1.get(wumpiind), 3);
                wumpiind=adj1.get(wumpiind);
                break;
              }
              else
              {
                cave1=true;
              }
            }
            if (nextcave==1)
            {
              if (danger.get(adj2.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj2.get(wumpiind), 3);
                wumpiind=adj2.get(wumpiind);
                break;
              }
              else
              {
                cave2=true;
              }
            }
            if (nextcave==2)
            {
              if (danger.get(adj3.get(wumpiind))==0)
              {
                danger.set(wumpiind, 0);
                danger.set(adj3.get(wumpiind), 3);
                wumpiind=adj3.get(wumpiind);
                break;
              }
              else
              {
                cave3=true;
              }
            }
          }
          if (wumpiind==curcave)
          {
            stillalive=false;
            System.out.println("The wumpus ran into your cave and KILLED YOU!");
          }
        }
      }
    }
  }
  }
  if (!stillalive)
  {
    System.out.println("YOU ARE DEAD!");
  }
  else if (numwumpi == 0)
  {
    System.out.println("YOU HAVE KILLED THE WUMPI!");
  }
  }
}
