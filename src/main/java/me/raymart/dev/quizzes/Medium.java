package me.raymart.dev.quizzes;

import me.raymart.dev.question.Question;

import java.util.List;
import java.util.Scanner;

public class Medium extends AbstractQuiz {

    public Medium(List<Question> questions, Scanner scanner) {
        super(questions, scanner, 50, Difficulty.MEDIUM, 120);
    }
}
