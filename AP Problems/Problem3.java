1) a) 

public double getScore (ArrayList<String> key) {
    double count = 0.0;
    for (int i = 0; i < answers.size(); i++) {
        if (answers.get(i).equals(key.get(i))) {
            count += 1.0;
        }
        else if (answers.get(i).equals("?")) {
            count += 0.0;
        }
        else {
            count -= 0.25;
        }
    }
    return count;
}

b)

public String highestScoringStudent(ArrayList<String> key) {
    String student = "";
    double maxScore = 0.0;
    for (int i = 0; i < key.size(); i++) {
        if (sheets.get(i).getScore(key) > max) {
            maxScore = sheets.get(i).getScore(key);
            student = sheets.get(i).getName();
        }
    }
    return student;
}
