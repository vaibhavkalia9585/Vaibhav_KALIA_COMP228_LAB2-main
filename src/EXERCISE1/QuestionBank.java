package EXERCISE1;

import java.util.Random;
import java.util.Scanner;

public class QuestionBank {

    private int correctAnswer = 0;
    private int totalCount = 1;
    private Scanner scanner = new Scanner(System.in);

    protected void checkAnswer(String qNumber, String input) {
        String ans = "";
        input = input.toLowerCase();
        boolean userMes = false;

        switch (qNumber) {
            case "q1", "q5", "q2":
                if (input.equals("d")) {
                    correctAnswer++;
                    userMes = true;
                } else
                    ans += "\nThe correct answer is: D";
                break;
            case "q3":
                if (input.equals("a")) {
                    correctAnswer++;
                    userMes = true;
                } else
                    ans += "\nThe correct answer is: A";
                break;
            case "q4":
                if (input.equals("c")) {
                    correctAnswer++;
                    userMes = true;
                } else
                    ans += "\nThe correct answer is: C";
                break;
        }
        System.out.println(generateMessage(userMes) + ans);
    }

    protected String generateMessage(boolean userAns) {
        Random randomObject = new Random();
        if (userAns) {
            switch (randomObject.nextInt(4)) {
                case 0: return "Very good!";
                case 1: return "Excellent!";
                case 2: return "Keep up the good work!";
                case 3: return "Good!";
            }
        } else {
            switch (randomObject.nextInt(4)) {
                case 0: return "No. Please try again.";
                case 1: return "Wrong. Try once more.";
                case 2: return "Don't give up!";
                case 3: return "No. Keep trying.";
            }
        }
        return "";
    }

    protected void inputAnswer() {
        while (totalCount <= 5) {
            System.out.println(simulateQuestion("q" + totalCount));
            String answer = scanner.nextLine();

            if (answer.toLowerCase().matches("[a-d]")) {
                checkAnswer("q" + totalCount, answer);
                totalCount++;
            } else {
                System.out.println("Make sure you enter 'a', 'b', 'c', or 'd'.");
            }
        }

        int total = 5;
        double percent = ((double) correctAnswer / (double) total) * 100;

        if (totalCount == 6) {
            System.out.println("Congrats! You have finished the test!" +
                    "\nCorrect answers: " + correctAnswer +
                    "\nIncorrect answers: " + (total - correctAnswer) +
                    "\nPercentage of correct answers: " + percent + "%");
        }
    }

    private String simulateQuestion(String qNumber) {
        switch (qNumber) {
            case "q1":
                return """
                        Which one is the correct type format in Java (eclipse)?
                        A. bool
                        B. Int
                        C. integer
                        D. String""";
            case "q2":
                return """
                        Which one is written in correct format?
                        A. System.out.println('%d%n','name');
                        B. System.out.println(%d%n,'name');
                        C. System.out.println(name);
                        D. System.out.printf('%s%n','name');""";
            case "q3":
                return """
                        Which value of x will the program return false?
                        if(x!=10 || x >= 9)
                        {
                        return true;
                        }
                        A. x = 8
                        B. x = 9
                        C. x = 10
                        D. x = 11""";
            case "q4":
                return """
                        For a Java developer, which is a wrong naming convention?
                        A. Variable names start with a lowercase character for the first word and uppercase for every other word
                        B. Classes start with an uppercase character of every word
                        C. Methods start with a lowercase character for the first word and lowercase for every other word
                        D. Packages use only lowercase characters""";
            case "q5":
                return """
                        a = ?
                        int a = 2 * 9 + 20 % 9;
                        A. 1
                        B. 2
                        C. 19
                        D. 20""";
            default:
                return "";
        }
    }
}
