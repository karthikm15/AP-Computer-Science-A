3) a)

public Player requestSlot (String playerName) {
    for (int i = 0; i < slots.length; i++) {
        if (slots[i].equals(null)) {
            Player newPlayer = new Player(playerName, i);
            slots[i] = newPlayer;
            return newPlayer;
        }
    }
    waitingList.add(playerName);
    return null;
}

b)

public Player cancelandReassignSlot(Player p) {
    int index = Integer.MAX_INT;
    for (int i = 0; i < slots.length; i++) {
        if (slots[i].equals(p)) {
            index = p.getPlayerNumber();
            slots[i] = null;
            break;
        }
    }
    if (waitingList.size() == 0) {
        return null;
    }
    else {
        Player newPlayer = new Player(waitingList.get(0), index);
        slots[i] = newPlayer;
        waitingList.remove(0);
        return newPlayer;
    }
}
