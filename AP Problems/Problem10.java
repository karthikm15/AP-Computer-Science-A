1) a)

public int getDuration() {
    if (flights.size() == 0 {
        return 0;
    }
    return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()-1).getArrivalTime());
}

public int getShortestLayover() {
    if (flights.size() < 2) {
        return -1;
    }
    int shortestTime = Integer.MAX_VALUE;
    for (int i = 0; i < flights.size()-1; i++) {
        if (shortestTime > flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime())) {
            shortestTime = flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime());
        }
    }
    return shortestTime;
}
