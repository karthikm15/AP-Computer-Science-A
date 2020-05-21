1) a)

public Reservation requestRoom (String guestName) {
    for (int i = 0; i < rooms.length; i++) {
        if (rooms[i].getRoomNumber() == null) {
            Reservation reservation = new Reservation (guestName, i);
            rooms[i] = reservation;
            return reservation;
        }
    }
    waitList.add(guestName);
    return null;
}

b)
public Reservation cancelandReassign (Reservation res) {
    int index = 0;
    for (int i = 0; i < rooms.length; i++) {
        if (rooms[i] == res) {
            index = i;
            break;
        }
    }
    if (waitList.size() == 0) {
        rooms[index] = null;
        return null;
    }
    else {
        Reservation reservation = new Reservation (waitList.get(0), index);
        waitList.remove(0);
        rooms[index] = reservation;
        return reservation;
    }
}
