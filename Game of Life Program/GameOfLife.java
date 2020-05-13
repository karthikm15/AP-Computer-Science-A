import java.util.*;

public class GameofLife

{

    private int n; private int m;

    private int gen = 1; private int polar = 0;

    private int[][][] a = new int[1000][1000][2];

    public GameofLife(int nn, int mm)

    {

        n = nn; m = mm;


        for (int i=0; i<n+2; i++) {

            for (int j=0; j<m+2; j++) {

                Random r = new Random();

                a[i][j][1] = r.nextInt(2);

                if (i == 0 || j == 0 || i == n+1 || j == n+1)

                    a[i][j][1] = 0;

            }

        }

    }


    

    public void newGen() {

        polar = 0;

        for (int i=1; i<n+1; i++) {

            for (int j=1; j<n+1; j++) {

                int n = 0;

                for (int k=i-1; k<i+2; k++) {

                    for (int l=j-1; l<j+2; l++) {

                        if (k != i || l != j) {

                            n += a[k][l][(gen+1)%2];

                        }

                    }

                }

                if (n == 3) {

                    a[i][j][gen%2] = 1;

                } else if (n <= 1 || n >= 4) {

                    a[i][j][gen % 2] = 0;

                } else {

                    a[i][j][gen % 2] = a[i][j][(gen+1) % 2];

                }

                polar += a[i][j][gen % 2];

            }

        }

        gen ++;

    }

    

    public void printGen() {

        System.out.println("GENERATION # " + gen);

        System.out.println(polar + " Polar Bears");

        System.out.println();

        System.out.println();

        for (int i=1; i<n+1; i++) {

            for (int j=0; j<m+1; j++) {

                if (a[i][j][gen%2] == 1)

                    System.out.print("*");

                else

                    System.out.print(" ");

            }

            System.out.println();

        }

    }

    

    public static void main(String [] args) {

        

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows:");

        int n = s.nextInt();

        System.out.println("Enter the number of columns:");

        int m = s.nextInt();

        GameofLife g = new GameofLife(n, m);

        boolean stop = false;

        while (stop == false) {

            g.printGen();

            System.out.println("S)TOP OR C)ONTINUE?");

            String q = s.nextLine();

            if (q == "S")

                break;

            g.newGen();

        }

    }

}

