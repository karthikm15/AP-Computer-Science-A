1) a) 

public double average (int first, int last) {
    double mean = 0.0;
    for (int i = first, i < last+1; i++) {
        mean += (double) scores[i];
    }
    return mean/ (double) (first-last+1)
}

b)
public boolean hasImproved() {
    for (int i = 0; i < scores.length -1; i++) {
        if (scores[i] > scores[i+1]) {
            return false;
        }
    }
    return true;
}

c)
public double finalAverage() {
    if (hasImproved()) {
        return average(scores.length/2, scores.length-1);
    }
    else {
        return average(0, scores.length-1);
    }
}
