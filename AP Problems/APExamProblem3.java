//AP ID: U6593YV7
//Initials: K.M.
import java.util.*;
// APCSA Question 2, part a 
public static boolean runSimulation (int sampleSize) {
    int firsthalf = 0;
    for (int i = 0; i < sampleSize/2; i++) {
        int num = getInt();
        // I am considering 0 to be a positive value.
        if ((isTarget(num)) && (num >= 0)) {
            firsthalf++;
        }
    }
    int secondhalf = 0;
    for (int i = sampleSize/2; i < sampleSize; i++) {
        int number = getInt();
        if ((isTarget(number))  && (number >= 0)) {
            secondhalf++;
        }
    }
    return firsthalf > secondhalf;
}

// APCSA Question 2, part b 
First, I would put a private instance variable in the beginning of the class called numValues.
Then, I would create a new method: public TargetIntegers (int input). The input 
would be provided by the user when he is declaring the class. 
I would then set numValues to be equal to input 
inside of this method. Additionally, now, there would be no use for a SampleSize parameter
inside of the runSimulation() method because there is already a variable 
that tells the sample size.
