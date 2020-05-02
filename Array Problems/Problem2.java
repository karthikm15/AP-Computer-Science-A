mport java.util.Random;
/**
 * Write a description of class Chap7E2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chap7E2
{
	private int[] values;
	public Chap7E2(int[] initialValues)
	{
    	values = initialValues;
	}
	public void swapFirstandLast()
	{
    	values[values.length-1] += values[0];
    	values[0] = values[values.length-1]-values[0];
    	values[values.length-1] = values[values.length-1]-values[0];
	}
	public void shiftRight()
	{
    	int temp = values[values.length-1];
    	for (int i=values.length-2; i>=0; i--
    	)
    	{
        	values[i+1]=values[i];
   	
    	}
    	values[0]=temp;
	}
	public void replaceEven()
	{
    	for (int i=0; i<values.length; i++)
    	{
        	if (values[i]%2==0)
        	{
            	values[i]=0;
        	}
    	}
	}
	public void replaceLarger()
	{
    	for (int i=1; i<values.length-1; i++)
    	{
        	int mx = values[i-1] > values[i+1] ? values[i-1] : values[i+1];
        	values[i]=mx;
    	}
	}
	public void removemiddle()
	{
    	if (values.length%2==0)
    	{
        	values[values.length/2]=0;
    	}
    	if (values.length%2==1)
    	{
        	values[values.length/2]=0;
        	values[values.length/2+1]=0;
    	}
	}
	public void moveFront()
	{
    	int[] temp = new int[values.length];
    	int counter = 0;
    	for (int i=0; i<values.length; i++)
    	{
        	if (values[i] % 2 == 0) {
            	temp[counter] = values[i];
            	counter++;
        	}
    	}
    	for (int i=0; i<values.length; i++)
    	{
        	if (values[i] % 2 == 1) {
            	temp[counter] = values[i];
            	counter++;
        	}
    	}
	}
	public int returnsecond()
	{
    	int mx=0;
    	int mx2=0;
    	for (int i=0; i<values.length; i++)
    	{
        	if (values[i]>mx)
        	{
            	mx = values[i];
        	}
    	}
    	for (int i=0; i<values.length; i++)
    	{
        	if ((values[i]>mx2) && (values[i] != mx))
        	{
            	mx2 = values[i];
        	}
    	}
    	return mx2;
	}
	public boolean sortedorder()
	{
    	for (int i=0; i<values.length-1; i++)
    	{
        	if (values[i]>values[i+1])
        	{
            	return false;
        	}
    	}
    	return true;
	}
	public boolean duplicate()
	{
    	for (int i=0; i<values.length-1; i++)
    	{
        	if (values[i]==values[i+1])
        	{
            	return true;
        	}
    	}
    	return false;
	}
	public boolean checkduplicate()
	{
    	for (int i=0; i<values.length; i++)
    	{
        	for (int j=0; j<values.length; j++)
        	{
            	if (i==j)
            	{
                	continue;
            	}
            	if (values[i]==values[j])
            	{
                	return true;
            	}
        	}
    	}
    	return false;
	}
	public static void main(String[] args) {
    	int arr[] = new int[10];
    	Random gen = new Random();
    	
    	for (int i = 0; i < 10; i++) {
        	int k = gen.nextInt(50);
        	arr[i] = k;
    	}
    	Chap7E2 newArray = new Chap7E2(arr);
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	newArray.swapFirstandLast();
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	newArray.shiftRight();
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	newArray.replaceEven();
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	newArray.replaceLarger();
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	newArray.removemiddle();
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	newArray.moveFront();
    	for (int i=0; i<arr.length; i++)
    	{
        	System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	System.out.println(newArray.returnsecond());
    	System.out.println(newArray.sortedorder());
    	System.out.println(newArray.duplicate());
    	System.out.println(newArray.checkduplicate());
	}
}
