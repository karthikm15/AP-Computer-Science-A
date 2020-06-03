4) a)

private boolean forwardMoveBlocked(){
    return (pos == hall.length-1);
}

b)

private void move(){
    if (hall[pos] != 0)
        hall[pos]--;
    else if (hall[pos] == 0) {
        if (forwardMoveBlocked()) 
            facingRight = !facingRight;
        else if (facingRight)
            pos++;
        else pos--;
    }
}

c)
public int clearHall(){
    int count = 0;
    while (!hallIsClear()){
        move();
        count++;
    }
    return count;
}
