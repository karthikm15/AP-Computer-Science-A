1) a)
import java.util.ArrayList;
public ArrayList<String> getDelimitersList (String[] tokens) {
    ArrayList<String> newList = new ArrayList<String>();
    for (int i = 0; i < tokens.size(); i++) {
        String token = tokens.get(i);
        if (token.equals(openDel)) || (token.equals(closeDel)) {
            newList.add(token);
        }
    }
    return newList;
}

b)
public boolean isBalanced(ArrayList<String> delimiters) {
    int countOpen = 0;
    int countClosed = 0;
    
    for (int i = 0; i < delimiters.size(); i++) {
        String delimiter = delimiters.get(i);
        if (delimiter.equals(openDel)) {
            countOpen++;
        }
        if (delimiter.equals(closeDel)) {
            countClosed++;
        }
        
        if (countClosed > countOpen) {
            return false;
        }
    }
    return (countClosed == countOpen);
}
