import java.util.*;
public class Chap7E5 {
	public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);
    	Random gen = new Random();
    	int arr[][] = new int[10][10];
    	
    	for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
            	arr[i][j] = gen.nextInt(5) * 10;
        	}
    	}
    	
    	for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
            	System.out.print (arr[i][j] + " ");
        	}
        	System.out.println();
    	}
    	while (true) {
        	System.out.println("Do you want a price (1) or seat(2) or to exit(0)");
        	int n = myScanner.nextInt();
        	
        	if (n==2) {
            	System.out.println("Specify the row and column number.");
            	int row = myScanner.nextInt();
            	int col = myScanner.nextInt();
            	
            	arr[row-1][col-1] = 0;
        	}
        	else if (n==1) {
            	System.out.println("Specify a price");
            	int price = myScanner.nextInt();
            	boolean isThere = false;
            	for (int i = 0; i < 10; i++) {
                	for (int j = 0; j < 10; j++) {
                    	if (arr[i][j] == price) {
                        	isThere = true;
                        	System.out.println("Found a seat for you in row " + (i+1) + " and column " + (j+1));
                        	arr[i][j] = 0;
                        	break;
                    	}
                	}
                	if (isThere) {
                    	break;
                	}
            	}
            	if (!isThere) {
                	System.out.println("Sorry we could not find your price.");
            	}
        	}
        	else {
            	System.out.println("EXITED!");
            	return;
        	}
        	for (int i = 0; i < 10; i++) {
            	for (int j = 0; j < 10; j++) {
                	System.out.print (arr[i][j] + " ");
            	}
            	System.out.println();
        	}
        	System.out.println();
    	}
	}
}
