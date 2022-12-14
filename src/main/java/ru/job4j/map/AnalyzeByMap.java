package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double subject = 0;
        double scoreResult = 0;
        for (Pupil scores : pupils) {
            for (Subject subjects : scores.subjects()) {
                scoreResult += subjects.score();
                subject++;
            }
        }
        return scoreResult / subject;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil scores : pupils) {
            int scoreResult = 0;
            for (Subject subjects : scores.subjects()) {
                scoreResult += subjects.score();
            }
            score.add(new Label(scores.name(), (double) scoreResult / scores.subjects().size()));
        }
        return score;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> subj = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil scores : pupils) {
            for (Subject subjects : scores.subjects()) {
                if (temp.containsKey(subjects.name())) {
                    int rsl = temp.get(subjects.name()) + subjects.score();
                    temp.put(subjects.name(), rsl);
            } else {
                    temp.put(subjects.name(), subjects.score());
                }
            }
        }
        for (String tmp : temp.keySet()) {
            subj.add(new Label(tmp, (double) (temp.get(tmp)) / pupils.size()));
        }
        return subj;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil scores : pupils) {
            int scoreResult = 0;
            for (Subject subjects : scores.subjects()) {
                scoreResult += subjects.score();
            }
            score.add(new Label(scores.name(), (double) scoreResult));
        }
        score.sort(Comparator.naturalOrder());
        return score.get(score.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> subj = new ArrayList<>();
        Map<String, Integer> temp = new LinkedHashMap<>();
        for (Pupil scores : pupils) {
            for (Subject subjects : scores.subjects()) {
                if (temp.containsKey(subjects.name())) {
                    int rsl = temp.get(subjects.name()) + subjects.score();
                    temp.put(subjects.name(), rsl);
                } else {
                    temp.put(subjects.name(), subjects.score());
                }
            }
        }
        for (String tmp : temp.keySet()) {
            subj.add(new Label(tmp, (double) (temp.get(tmp))));
    }
        subj.sort(Comparator.naturalOrder());
        return subj.get(subj.size() - 1);
    }
}