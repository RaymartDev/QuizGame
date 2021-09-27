package me.raymart.dev.quizzes;

import me.raymart.dev.QuizGame;

import java.util.Arrays;

public enum Difficulty {

    EASY("Easy"), MEDIUM("Medium"), HARD("Hard");

    private final String name;
    Difficulty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Difficulty getDifficulty(String name) {
        return Arrays.stream(Difficulty.values())
                .filter(d -> d.getName().equalsIgnoreCase(name))
                .findAny().orElse(MEDIUM);
    }

    public AbstractQuiz getQuiz() {
        if(getName().equalsIgnoreCase("Easy")) {
            return QuizGame.getEasyQuiz();
        }
        if(getName().equalsIgnoreCase("Medium")) {
            return QuizGame.getMediumQuiz();
        }
        return QuizGame.getHardQuiz();
    }
}
