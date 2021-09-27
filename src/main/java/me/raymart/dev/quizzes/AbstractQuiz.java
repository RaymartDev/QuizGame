package me.raymart.dev.quizzes;

import me.raymart.dev.question.Question;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractQuiz {

    private int answeredQuestions = 0;
    private int grade = 0;
    private int correctAnswers = 0;
    private final List<Question> questions;
    private final Scanner scanner;
    private final int passingPercentage;
    private final Difficulty difficulty;
    private final long timeLimit;
    public AbstractQuiz(List<Question> questions, Scanner scanner, int passingPercentage, Difficulty difficulty, long timeLimit) {
        this.questions = questions;
        this.scanner = scanner;
        this.passingPercentage = passingPercentage;
        this.difficulty = difficulty;
        this.timeLimit = timeLimit == -1 ? -1 : System.currentTimeMillis() + (timeLimit * 1000);
    }


    public List<Question> getQuestions() {
        return questions;
    }

    public void compute() {
        double rawGrade = (double)(correctAnswers) / (double)(questions.size());
        rawGrade *= 100;

        grade = (int) rawGrade;
    }

    public void start() {

        System.out.println("Quiz has commenced, Good Luck!");
        System.out.println("Passing grade is: " + passingPercentage + ".");
        System.out.println("There are " + questions.size() + " number of questions.");
        System.out.println("Any letter that is not part of the choices is considered wrong!");
        System.out.println("Difficulty Level: " + difficulty.getName() + ".\n");


        while(timeLimit > System.currentTimeMillis() || answeredQuestions != questions.size()) {
            Question question = questions.get(answeredQuestions);

            System.out.println(question.getQuestion());
            System.out.println("A. " + question.getChoices()[0]);
            System.out.println("B. " + question.getChoices()[1]);
            System.out.println("C. " + question.getChoices()[2]);
            System.out.println("Please choose carefully.");

            String input = scanner.nextLine().trim();

            if(input.toCharArray()[0] == question.getAnswer()) {
                correctAnswers += 1;
            }
            answeredQuestions += 1;
        }

        compute();

        System.out.println("Quiz ended.");
        System.out.println("Your grade: " + grade + "%");

        if(passingPercentage > grade) {
            System.out.println("Review your notes, and try again later.");
        } else {
            System.out.println("Congratulations you passed!!!");
        }
    }
}
