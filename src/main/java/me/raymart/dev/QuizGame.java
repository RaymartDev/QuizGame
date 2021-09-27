package me.raymart.dev;

import me.raymart.dev.question.Question;
import me.raymart.dev.quizzes.Difficulty;
import me.raymart.dev.quizzes.Easy;
import me.raymart.dev.quizzes.Hard;
import me.raymart.dev.quizzes.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class QuizGame {
    public static Scanner scanner = null;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Welcome to my Quiz Game.");
        System.out.println("to start you may choose a type of difficulty.");
        System.out.println("EASY, MEDIUM, HARD");
        System.out.println("Choose any difficulty above, anything that could not be found by system will automatically be MEDIUM difficulty.");

        Difficulty difficulty = Difficulty.getDifficulty(scanner.nextLine());
        difficulty.getQuiz().start();
    }

    public static Easy getEasyQuiz() {
        Question question1 = Question.builder()
                .question("How many permanent teeth does a dog have?")
                .choices(new String[] {"40", "41", "42"})
                .answer('c').build();

        Question question2 = Question.builder()
                .question("Who is the president of the United States?")
                .choices(new String[] {"Barack Obama", "Donald Trump", "Rodrigo Duterte"})
                .answer('b').build();


        Question question3 = Question.builder()
                .question("On average how far away is the moon from the earth in miles?")
                .choices(new String[] {"238,000", "240,000", "300,000"})
                .answer('a').build();

        Question question4 = Question.builder()
                .question("Which country in the world is believed to have the most miles of motorway?")
                .choices(new String[] {"Vietnam", "Taiwan", "China"})
                .answer('c').build();

        Question question5 = Question.builder()
                .question("In what year did The Beatles split up?")
                .choices(new String[] {"1970", "2000", "2020"})
                .answer('a').build();

        return new Easy(Arrays.asList(question1, question2, question3, question4, question5), scanner);
    }

    public static Medium getMediumQuiz() {
        Question question1 = Question.builder()
                .question("How many horses are on each team in a polo match?")
                .choices(new String[] {"4", "5", "6"})
                .answer('a').build();

        Question question2 = Question.builder()
                .question("Which British actor will play Batman in the upcoming reboot directed by Matt Reeves?")
                .choices(new String[] {"Robert Pattinson", "Rowan Atkinson", "Benedict Cumberbatch"})
                .answer('a').build();


        Question question3 = Question.builder()
                .question("Who is the british actor who played harry in the movie 'Harry Potter'")
                .choices(new String[] {"Daniel Radcliffe", "Emma Watson", "Matthew Lewis"})
                .answer('a').build();

        Question question4 = Question.builder()
                .question("What is the capital city of Australia?")
                .choices(new String[] {"Pyongyang", "America", "Canberra"})
                .answer('c').build();

        Question question5 = Question.builder()
                .question("Which US state was Donald Trump born in?")
                .choices(new String[] {"Dallas", "New York", "Australia"})
                .answer('b').build();

        return new Medium(Arrays.asList(question1, question2, question3, question4, question5), scanner);
    }

    public static Hard getHardQuiz() {
        Question question1 = Question.builder()
                .question("What is the one thing that all wise men, regardless of their religion or politics, agree is between heaven and earth? What is it?")
                .choices(new String[] {"The Word \"And\"", "The Word \"Or\"", "The Word \"Cool\""})
                .answer('a').build();

        Question question2 = Question.builder()
                .question("What letter comes next: O T T F F S S ?")
                .choices(new String[] {"The Letter B", "The Letter Z", "The Letter E"})
                .answer('c')
                .build();

        Question question3 = Question.builder()
                .question("In what US State is the city Nashville?")
                .choices(new String[] {"Tennessee", "Call of Duty", "Texas"})
                .answer('a')
                .build();

        Question question4 = Question.builder()
                .question("From what grain is the Japanese spirit Sake made?")
                .choices(new String[] {"Beans", "Cake", "Rice"})
                .answer('c')
                .build();

        Question question5 = Question.builder()
                .question("What sport did David Beckham play?")
                .choices(new String[] {"Basketball", "Hockey", "Football"})
                .answer('c')
                .build();

        return new Hard(Arrays.asList(question1, question2, question3, question4, question5), scanner);
    }
}
