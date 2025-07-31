package wrapper;

import java.util.*;

public class StudentScoreBoard {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentScores = new HashMap<>();

        studentScores.put("Alice", Arrays.asList(90, 85, 88));
        studentScores.put("Bob", Arrays.asList(75, 80, 72));
        studentScores.put("Charlie", Arrays.asList(95, 92, 93));

        String topStudent = "";
        double highestAvg = 0;

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> scores = entry.getValue();

            int total = 0;
            for (Integer score : scores) {
                total += score; // Unboxing
            }

            double average = (double) total / scores.size();
            System.out.println(name + " -> Scores: " + scores + ", Average: " + average);

            if (average > highestAvg) {
                highestAvg = average;
                topStudent = name;
            }
        }

        System.out.println("Top Scorer: " + topStudent + " with average " + highestAvg);
    }
}

