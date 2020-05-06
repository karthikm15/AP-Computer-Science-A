public class Chap7P2
{
	// instance variables - replace the example below with your own
   public static void main(String args[]){
   	Random gen = new Random();
   	int arr[] = new int[20];
   	for (int i = 0; i < 20; i++) {
       	int n = gen.nextInt(20);
       	arr[i] = n;
   	}
   	int maxseq = 0;
   	int seq = 0;
   	int indexfirst = 0;
   	int indexlast = 0;
   	int storeLast = 0;
   	for (int i = 0; i < 20; i++) {
       	int num = arr[i];
       	seq = 1;
       	for (int j = i+1; j < 20; j++) {
           	if (num == arr[j]) {
               	seq++;
            	}
            	else{
                	storeLast = j-1;
                	break;
            	}
        	}
        	if (seq > maxseq) {
            	maxseq = seq;
            	indexfirst = i;
            	indexlast = storeLast;
        	}
    	}
    	for (int i = 0; i < 20; i++) {
        	if (indexfirst == i) {
            	System.out.print("( ");
        	}
        	System.out.print(arr[i] + " ");
        	if (indexlast == i) {
            	System.out.print(") ");
        	}
    	}
   }
	
}
