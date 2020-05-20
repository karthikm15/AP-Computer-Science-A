1) a)

public static boolean isSelfDivisor (int number) {
    while (number != 0) {
        int num = number % 10;
        num /= 10;
        
        if (num == 0) {
            return false;
        }
        else if (number % num != 0) {
            return false;
        }
    }
    return true;
}

b)

public static int[] firstNumSelfDivisors (int start, int num) {
    int [] arr = new int[num];
    
    int count = 0;
    while (count != num) {
        if (isSelfDivisor(start)) {
            arr[count] = start;
            count++;
        }
        start++;
    }
    
    return arr;
}
