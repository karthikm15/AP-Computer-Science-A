1) a) 

public boolean record (int score) {
    for (int i = 0; i < scoreList.size(); i++) {
        if (scoreList.get(i).getScore() == score) {
            scoreList.get(i).numStudents++;
            return false;
        }
    }
    if (!isThere) {
        for (int i = 0; i < scoreList.size(); i++) {
            ScoreInfo example = new ScoreInfo (score);
            if ((i == 0) && score < scoreList.get(i).getScore()) {
                scoreList.add(0, example);
                return false;
            }
            else if ((i == scoreList.size()-1) && score > scoreList.get(i).getScore()) {
                scoreList.add(example);
                return false;
            }
            else if (scoreList.get(i) < score) && (score > scoreList.get(i+1)) {
                scoreList.add(i+1, example);
                return false;
            }
        }
    }
    return false;
}

b)
public void recordScores (int[] stuScores) {
    for (int i = 0; i < stuScores.length; i++) {
        record(stuScores[i]);
    }
}

c) The header would be getSeniorPercent(int score) because the only input that is needed is the score at which seniors have to be at. Additionally,
the ScoreInfo class would be needed to be changed such that there is an instance variable on the top that represents the number of seniors.
Additionally, there needs to be a method that increments the number of seniors every time that a senior has that certain score. Lastly, there
needs to be a method that returns the number of seniors with that particular score.
