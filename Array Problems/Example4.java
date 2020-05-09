public class Chap7P6
{
	public static void main(String args[])
	{
    	Scanner myScan = new Scanner(System.in);
    	System.out.println("Welcome to Tic tac toe!");
    	char board[][] = new char[3][3];
    	for (int i=0; i<3; i++)
    	{
        	for (int j=0; j<3; j++)
        	{
            	board[i][j]='_';
        	}
    	}
    	boolean check=true;
    	while (check)
    	{
        	System.out.println("Player 1's turn");
        	int x = myScan.nextInt();
        	int y = myScan.nextInt();
        	x--;
        	y--;
        	while (board[x][y]!='_')
        	{
           	System.out.println("Bad");
           	x = myScan.nextInt();
           	y = myScan.nextInt();
           	x--;
           	y--;
        	}
        	board[x][y]='X';
        	for (int i=0; i<3; i++)
        	{
            	for (int j=0; j<3; j++)
            	{
                	System.out.print(board[i][j]);
            	}
            	System.out.println();
        	}
        	System.out.println();
        	for (int i=0; i<3; i++)
        	{
            	int num=0;
            	for (int j=0; j<3; j++)
            	{
                	if (board[i][j]=='X')
                	{
                    	num++;
                	}
            	}
            	if (num==3)
            	{
                	check=false;
            	}
        	}
        	for (int i=0; i<3; i++)
        	{
            	int num=0;
            	for (int j=0; j<3; j++)
            	{
                	if (board[j][i]=='X')
                	{
                    	num++;
                	}
            	}
            	if (num==3)
            	{
                	check=false;
            	}
        	}
        	int num=0;
        	for (int i=0; i<3; i++)
        	{
            	if (board[i][i]=='X')
                	{
                    	num++;
                	}
        	}
        	if (num==3)
            	{
                	check=false;
            	}
        	num=0;
        	for (int i=2; i>=0; i--)
        	{
            	if (board[i][i]=='X')
                	{
                    	num++;
                	}
        	}
        	if (num==3)
            	{
                	check=false;
            	}
        	if (!check)
        	{
            	System.out.println("Player 1 wins");
            	break;
        	}
        	check=false;
        	for (int i=0; i<3; i++)
        	{
            	for (int j=0; j<3; j++)
            	{
                	if (board[i][j]=='_')
                	{
                    	check=true;
                	}
            	}
        	}
        	if (!check)
        	{
            	break;
        	}
        	System.out.println("Player 2's turn");
        	x = myScan.nextInt();
        	y = myScan.nextInt();
        	x--;
        	y--;
        	while (board[x][y]!='_')
        	{
           	System.out.println("Bad");
           	x = myScan.nextInt();
           	y = myScan.nextInt();
           	x--;
           	y--;
        	}
        	board[x][y]='O';
        	for (int i=0; i<3; i++)
        	{
            	for (int j=0; j<3; j++)
            	{
                	System.out.print(board[i][j]);
            	}
            	System.out.println();
        	}
        	System.out.println();
        	for (int i=0; i<3; i++)
        	{
            	num=0;
            	for (int j=0; j<3; j++)
            	{
                	if (board[i][j]=='O')
                	{
                    	num++;
                	}
            	}
            	if (num==3)
            	{
                	check=false;
            	}
        	}
        	for (int i=0; i<3; i++)
        	{
            	num=0;
            	for (int j=0; j<3; j++)
            	{
                	if (board[j][i]=='O')
                	{
                    	num++;
                	}
            	}
            	if (num==3)
            	{
                	check=false;
            	}
        	}
        	num=0;
        	for (int i=0; i<3; i++)
        	{
            	if (board[i][i]=='O')
                	{
                    	num++;
                	}
        	}
        	if (num==3)
            	{
                	check=false;
            	}
        	num=0;
        	for (int i=2; i>=0; i--)
        	{
            	if (board[i][i]=='O')
                	{
                    	num++;
                	}
        	}
        	if (num==3)
            	{
                	check=false;
            	}
        	if (!check)
        	{
            	System.out.println("Player 2 wins!");
            	break;
        	}
        	check=false;
        	for (int i=0; i<3; i++)
        	{
            	for (int j=0; j<3; j++)
            	{
                	if (board[i][j]=='_')
                	{
                    	check=true;
                	}
            	}
        	}
    	}
	}
}
