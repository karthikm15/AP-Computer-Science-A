1) a)

public String decodeString(ArrayList<StringPart> parts) {
    String str = "";
    for (int i = 0; i < parts.size(); i++) {
        str += masterstring.substring(parts.get(i).getStart(), parts.get(i).getStart() + parts.get(i).getLength());
    }
    return str;
}

b)

public ArrayList<StringPart> encodeString(String word) {
    ArrayList<StringPart> arrList = new ArrayList<StringPart>();
    for (int i = 0; i < word.length; i++) {
        arrList.add (findPart(word.substring(i, i+1));
    }
    return arrList;
}
