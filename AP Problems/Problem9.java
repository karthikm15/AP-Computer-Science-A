1)

public boolean conflictsWith (Appointment other) {
    return this.getTime().overlapsWith(other.getTime());
}

public void ClearConflicts (Appointment appt) {
    ArrayList<Appointment> newapptList = new ArrayList<Appointment>;
    for (int i = 0; i < apptList.size(); i++) {
        if (!apptList.get(i).geTime().overlapsWith(appt.getTime())) {
            newapptList.add(apptList.get(i));
        }
    }
    apptList = newappList;
}

public boolean addAppt(Appointment appt, boolean emergency) {
    if (emergency) {
        ClearConflicts (appt);
        apptList.add (appt);
        return true;
    }
    else {
        ArrayList<Appointment> placeholder = apptList;
        ClearConflicts (appt);
        if (placeholder.size() == apptList.size()) {
            apptList.add(appt);
            return true;
        }
        else {
            apptList = placeholder;
            return false;
        }
    }
}
