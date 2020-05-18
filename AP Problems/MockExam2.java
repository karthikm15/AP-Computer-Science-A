1) a)
private String recombine (String word1, String word2) {
    return word1.substring(0, word1.length/2) + word2.substring(word1.length/2, word1.length)
}

b) First, I would make the header so that it is private boolean checkValidLength(String word1, String word2). The recombine feature can be used 
so that it combines the first half and the second half together into one string. Then, it has two booleans, whether the new string length is less
than the word1's length and whether the new string length is less than word2's length. Then it checks if either boolean is true, and if one
of them is, then it will return true.
