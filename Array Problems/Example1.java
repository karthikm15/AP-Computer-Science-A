import java.util.Random;
public class Chap7E1 {
	public static void main(String[] args) {
    	int arr[] = new int[10];
    	
    	Random gen = new Random();
    	for (int i = 0; i < 10; i++) {
        	int k = gen.nextInt(50);
        	arr[i] = k;
    	}
    	System.out.println("Here are the numbers at even indexes.");
    	for (int i = 0; i < 10; i = i+2) {
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	System.out.println("Here are the even numbers.");
    	for (int i = 0; i < 10; i++) {
        	if (arr[i] % 2 == 0) {
            	System.out.print(arr[i] + " ");
        	}
    	}
    	System.out.println();
    	System.out.println("Here are the elements in reverse order.");
    	for (int i = 9; i >= 0; i--) {
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	System.out.println("The first element is " + arr[0]);
    	System.out.println("The last element is " + arr[9]);
	}
}

