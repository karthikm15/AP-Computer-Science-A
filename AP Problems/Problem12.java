1) a)

public int nextTankToFill (int threshold) {
    int minimum = Integer.MAX_VALUE;
    int index = filler.getCurrentIndex();
    for (int i = 0; i < tanks.size(); i++) {
        if (tanks.get(i).getFuelLevel() < minimum) && (tanks.get(i).getFuelLevel <= threshold) {
            index = i;
            minimum = tanks.get(i).getFuelLevel();
        }
    }
    return index;
}

b)

public void moveToLocation (int locIndex) {
    if ((filler.getCurrentIndex() > locIndex) && (filler.isFacingRight)){
        filler.changeDirection();
    }
    if (filler.getCurrentIndex() < locIndex) && (!filler.isFacingRight)) {
        filler.changeDirection();
    }
    filler.moveForward(Math.abs(locIndex - filler.getCurrentIndex()));
}

