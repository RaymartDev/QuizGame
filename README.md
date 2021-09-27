# Quiz Game

A simple quiz game that will practice your brain.

## Description

First, this quiz technically have 3 difficulties consisting:

 * Easy
 * Medium
 * Hard

Here are the differences ( questions are not segregated in terms of difficulty since this is just a prototype )

### **Easy**

In easy the passing score is 30% of the answered questions are correct and no time limit.

### **Medium**

In medium the passing score is 50% of the answered questions are correct and has 2 minutes time limit.

### **Hard**

In the last part or the hardest part, the passing score is 75% of the answered questions are correct and has 1 minute time limit.

### **Calculation**

(Correct Answers / Answered Questions) x 100 = percentage of the correct answers.

## Developer API

### **Creating a Quiz Object**

```java
public class YourQuiz extends AbstractQuiz {
    
   /**
     * @param questions collections of questions object
     * @param scanner the scanner object
     * @param passingPercentage the passing percentage
     * @param difficulty the difficulty level
     * @param timeLimit the time limit in seconds
     */
   public YourQuiz(List<Question> questions, Scanner scanner, int passingPercentage,
      Difficulty difficulty, long timeLimit) {
        super(questions, scanner, passingPercentage, difficulty, timeLimit);
    }
}
```

### **Creating a Question Object**
```java
 Question question1 = Question.builder()
                .question("What is the one thing that all wise men, 
                    regardless of their religion or politics,
                    agree is between heaven and earth? What is it?")
                .choices(new String[] {"The Word \"And\"", "The Word \"Or\"",
                    "The Word \"Cool\""})
                .answer('a')
                .build();```
