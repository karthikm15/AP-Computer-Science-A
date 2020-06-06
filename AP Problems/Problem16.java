2) a)

public Digits(int num){
    digitList = new ArrayList<Integer>();
    while (num != 0){
        digitList.add(0, new Integer(num%10));
        num /= 10;
    }
}

b) 
public boolean isStrictlyIncreasing(){
    for (int i = 0; i < digitList.size()-1; i++){
        if (digitList.get(i+1).intValue() <= digitList.get(i).intValue())
            return false;
    }
    return true;
}
