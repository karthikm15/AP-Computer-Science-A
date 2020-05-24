1) a)

public int numWordsofLength (int len) {
    int count = 0;
    for (int i = 0; i < myList.size(); i++) {
        if (myList.get(i).length == len) {
            count++;
        }
    }
    return count;
}

b)
public void removeWordsOfLength (int len) {
    ArrayList<String> arrList = new ArrayList<String>();
    for (int i = 0; i < myList.size(); i++) {
        if (myList.get(i).length != len) {
            arrList.add(myList.get(i));
        }
    }
    myList = arrList;
}


