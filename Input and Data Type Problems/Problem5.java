import java.util.Random;
public class Chap2P5 {
	public static void main(String[] args) {
    	Random number = new Random();
    	int num1 = number.nextInt(49) + 1;
    	int num2 = number.nextInt(49) + 1;
    	int num3 = number.nextInt(49) + 1;
    	int num4 = number.nextInt(49) + 1;
    	int num5 = number.nextInt(49) + 1;
    	int num6 = number.nextInt(49) + 1;
    	
    	System.out.println("Play this combination -- it'll make you rich!");
    	
    	System.out.print(num1);
    	System.out.print(" ");
    	System.out.print(num2);
    	System.out.print(" ");
    	System.out.print(num3);
    	System.out.print(" ");
    	System.out.print(num4);
    	System.out.print(" ");
    	System.out.print(num5);
    	System.out.print(" ");
    	System.out.print(num6);
    	System.out.print(" ");
	}
}
