// Page 202 AP Computer Science A Course and Exam Description

1) a)

public int getElectronicsByMaker (String maker) {
    int count = 0;
    for (int i = 0; i < purchases.size(); i++) {
        if (purchases.get(i).isElectronic() && purchases.get(i).getMaker().equals(maker)) {
            count++;
        }
    }
    return count;
}

b)

public boolean hasAdjacentEqualPair() {
    if (purchases.size() < 2) {
        return false;
    }
    for (int i = 0; i < purchases.size()-1; i++) {
        if (purchases.get(i).equals(purchases.get(i+1))) {
            return true;
        }
    }
    return false;
}

