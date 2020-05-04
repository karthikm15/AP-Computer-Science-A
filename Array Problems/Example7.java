public class Chap7E7
{
	public static void main(String args[])
	{
    	Scanner myScan = new Scanner(System.in);
    	int n;
    	System.out.println("Please input the size of your array");
    	n=myScan.nextInt();
    	int[] arr = new int[n];
    	for (int i=0; i<n; i++)
    	{
        	arr[n-i-1]=myScan.nextInt();
    	}
    	for (int i=0; i<n; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
	}
}
