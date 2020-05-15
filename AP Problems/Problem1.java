//Page 199 of AP Computer Science A Course and Exam Description
1) a)

public static int getCheck (int num) {
    int start = 7;
    int product = 0;
    for (int i = 0; i < getNumberofDigits(num); i++) {
        product += getDigit(num, i+1) * start;
        start--;
    }
    return getDigit(product, getNumberofDigits(product));
}

b)
public static boolean isValid (int numWithCheckDigit) {
    int checkDigit = getDigit(numWithCheckDigit, getNumberofDigits(numWithCheckDigit));
    int newNum = 0;
    for (int i = 0; i < getNumberofDigits(numWithCheckDigit) - 1; i++) {
        newNum += Math.pow(10, getNumberofDigits(numWithCheckDigit) - i - 2);
    }
    return getCheck(newNum) == checkDigit;
}
