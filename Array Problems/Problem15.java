public class Chap7E15
{
	public static void main(String args[])
	{
    	Scanner myScan = new Scanner(System.in);
    	int magsq[][] = new int[4][4];
    	int ints[] = new int[16];
    	System.out.println("Please input 16 numbers");
    	int count =0;
    	boolean check=false;
    	for (int i=0; i<4; i++)
    	{
        	for (int j=0; j<4; j++)
        	{
            	magsq[i][j]=myScan.nextInt();
            	ints[count]=magsq[i][j];
            	if (count!=0 && ints[count] != ints[count-1]-1)
            	{
                	check=true;
            	}
            	count++;
        	}
    	}
    	if (check==true && ints[0]==1)
    	{
        	System.out.println("Your numbers are 1,2, ... 16");
    	}
    	int sum=-1;
    	for (int i=0; i<4; i++)
    	{
        	int cursum=0;
        	for (int j=0; j<4; j++)
        	{
            	cursum+=magsq[i][j];
        	}
        	if (sum!=-1 && cursum!=sum)
        	{
            	System.out.println("Not a magic square");
            	return;
        	}
        	sum = cursum;
    	}
    	for (int i=0; i<4; i++)
    	{
        	int cursum=0;
        	for (int j=0; j<4; j++)
        	{
            	cursum+=magsq[j][i];
        	}
        	if (sum!=-1 && cursum!=sum)
        	{
            	System.out.println("Not a magic square");
            	return;
        	}
        	sum = cursum;
    	}
    	int csum=0;
    	for (int i=0; i<4; i++)
    	{
        	csum+=magsq[i][i];
    	}
    	if (sum!=-1 && csum!=sum)
        	{
            	System.out.println("Not a magic square");
            	return;
        	}
        	csum=0;
        	for (int i=3; i>=0; i--)
        	{
            	csum+=magsq[i][i];
        	}
        	if (sum!=-1 && csum!=sum)
        	{
            	System.out.println("Not a magic square");
            	return;
        	}
        	System.out.println("Magic square!!1!1");
	}
}
