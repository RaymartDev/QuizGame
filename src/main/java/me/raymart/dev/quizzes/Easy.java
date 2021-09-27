package me.raymart.dev.quizzes;

import me.raymart.dev.question.Question;

import java.util.List;
import java.util.Scanner;

public class Easy extends AbstractQuiz {

    public Easy(List<Question> questions, Scanner scanner) {
        super(questions, scanner, 30, Difficulty.EASY, -1);
    }
}
