import java.util.Random;
import java.util.ArrayList;
public class Main {
    private ArrayList<String> words;
    public Main(String[] array){
        words = new ArrayList<String>();
        for (int i = 0; i < array.length; i++){
            words.add(array[i]);
        }
    }
    
    public String getNext(){
        Random rand = new Random();
        if (words.size() == 0)
            return "NONE";
        return words.remove(rand.nextInt(words.size()));
    }
    
    public static void main(String[] args){
        String[] wordArray = {"wheels", "on", "the", "bus"};
        Main sChooser = new Main(wordArray);
        for (int k = 0; k < 6; k++){
            System.out.print(sChooser.getNext() + " ");
        }
    }
}
