1) a)

public boolean isLevelTrailSegment(int start, int end){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = start; i <= end; i++){
        if (markers[i] < min){
            min = markers[i];
        }
        if (markers[i] > max){
            max = markers[i];
        }
    }
    return (Math.abs(max-min) <= 10);
}

b) 
public boolean isDifficult(){
    int diffChanges = 0;
    for (int i = 0; i < markers.length-1; i++){
        if (Math.abs(markers[i]-markers[i+1]) >= 30)
            diffChanges++;
    }
    return (diffChanges >= 3);
}
