package me.raymart.dev.quizzes;

import me.raymart.dev.question.Question;

import java.util.List;
import java.util.Scanner;

public class Hard extends AbstractQuiz {

    public Hard(List<Question> questions, Scanner scanner) {
        super(questions, scanner, 75, Difficulty.HARD, 60);
    }
}
