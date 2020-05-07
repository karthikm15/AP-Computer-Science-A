import java.util.*;
public class Chap7P3
{
	public static void main(String args[])
	{
    	Scanner myScan = new Scanner(System.in);
    	System.out.println("Please input the number of stalls");
    	int n = myScan.nextInt();
    	char[] stalls = new char[n];
    	for (int i=0; i<n; i++)
    	{
        	stalls[i]='_';
    	}
    	boolean check=true;
    	while (check)
    	{
        	int mx = 0;
        	int st=0;
        	int ed=n-1;
        	int cs=0;
        	int cur=0;
        	for (int i=0; i<n; i++)
        	{
            	if (stalls[i]=='X')
            	{
                	if (mx<cur)
                	{
                    	mx=cur;
                    	st = cs;
                    	ed = i-1;
                	}
                	cs = i;
                	cur=0;
            	}
            	else
            	{
                	cur++;
            	}
        	}
        	if (mx<cur)
                	{
                    	mx=cur;
                    	st = cs;
                    	ed = n-1;
                	}
        	System.out.println(st + " " + ed);
        	stalls[(st+ed)%2==1 ? (st+ed)/2+1 : (st+ed)/2] = 'X';
        	check=false;
        	for (int i=0; i<n; i++)
        	{
            	if (stalls[i]=='_')
            	{
                	check=true;
            	}
            	System.out.print(stalls[i] + " ");
        	}
        	System.out.println();
    	}
	}
}
