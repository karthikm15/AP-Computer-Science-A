import java.util.*;
//APCSA Question 2, Part a)
public static int bagApples(double targetWeight, double allowedVariation){
    int count = 0;
    double appleWeight = 0;
    while (appleWeight <= (targetWeight-allowedVariation)){
        count++;
        appleWeight += getApple();
    }
    return count;
}

//APCSA Question 2, Part b)
To add this new feature to the bagApples method, first, I would store the weight
of the first apple in a variable called "firstAppleWeight" (type double). I would then make a new variable
called "allowedVariation" (type double) at the top of my method and set that equal
to 0.2*"firstAppleWeight". The "count" (type int) variable would be initialized as 1 to count
the first apple that has already been added to the weight of the bag.
You would set "appleWeight" (type double) equal to the "firstAppleWeight" before
the while loop as well. Before running the while loop, you would check if the appleWeight
is greater than the "targetWeight"-"allowedVariation"; if it is, then you would return 1 to
signify the first apple being put in the bag. If it isn't, then you would run the same
while loop as mentioned in part a). You would still return "count" at the ending as well.
