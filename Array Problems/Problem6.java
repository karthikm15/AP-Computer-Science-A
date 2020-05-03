public class Chap7E6
{
	public static void main (String args[])
	{
    	Scanner myScan = new Scanner(System.in);
    	int n;
    	System.out.println("Please input the size of your array");
    	n=myScan.nextInt();
    	int[] arr = new int[n];
    	int sum=0;
    	for (int i=0; i<n; i++)
    	{
        	arr[i]=myScan.nextInt();
        	if (i%2==0)
        	{
            	sum+=arr[i];
        	}
        	else
        	sum-=arr[i];
    	}
    	System.out.println(sum);
	}
}
