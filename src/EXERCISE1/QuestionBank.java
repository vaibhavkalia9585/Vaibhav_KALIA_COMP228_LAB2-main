package EXERCISE1;

import java.util.Random;

import javax.swing.JOptionPane;

public class QuestionBank {

    private int correct = 0;
    private int count = 1;



    protected void checkAnswer(String qNumber, String input) {
        String ans = "";
        input.toLowerCase();
        boolean userMes = false;
        switch (qNumber) {
            case "q1", "q5", "q2":
                if (input.equals("d")) {
                    correct++;
                    userMes = true;
                } else
                    ans += "\nThe correct answer is: D";
                break;
            case "q3":
                if (input.equals("a")) {
                    correct++;
                    userMes = true;
                } else
                    ans += "\nThe correct answer is: A";
                break;
            case "q4":
                if (input.equals("c")) {
                    correct++;
                    userMes = true;
                } else
                    ans += "\nThe correct answer is: C";
                break;
        }
        JOptionPane.showConfirmDialog(null, this.generateMessage(userMes) + ans);
    }

    protected String generateMessage(boolean userAns) {
        Random randomObject = new Random();
        String sysReply = "";
        if (userAns) {
            switch (randomObject.nextInt(4)) {
                case 0:
                    return ("Very good!");
                case 1:
                    return ("Excellent!");
                case 2:
                    return ("Keep up the good work!");
                case 3:
                    return ("Good!");
            }
        } else {
            switch (randomObject.nextInt(4)) {
                case 0:
                    return ("No. Please try again");
                case 1:
                    return ("Wrong. Try once more");
                case 2:
                    return ("Don't give up!");
                case 3:
                    return ("No. Keep trying..");
            }
        }
        return sysReply;
    }

    protected void inputAnswer() {
        while (count <= 5) {
            String answer = JOptionPane.showInputDialog(simulateQuestion("q" + count));
            if (answer.toLowerCase().equals("a") || answer.toLowerCase().equals("b") || answer.toLowerCase().equals("c")
                    || answer.toLowerCase().equals("d")) {
                this.checkAnswer("q" + count, answer);
                count++;
            } else
                JOptionPane.showConfirmDialog(null, "Make sure you enter 'a', 'b', 'c' or 'd'");
        }

        int total = 5;
        double percent = ( (double)correct / (double) total) * 100 ;

        while (count == 6) {
            JOptionPane.showConfirmDialog(null, "Congrats! You have finished the test!\nCorrect answer: " + correct
                    + "\nIncorrect answer: " + (total - correct) + "\nPercentage of correct answer: " + percent + "%");
            count++;
        }

    }private String simulateQuestion(String qNumber) {
        String question = "";

        switch (qNumber) {
            case "q1":
                question += """
                        Which one is the correct type format in Java (eclipse)?
                        A. bool
                        B. Int
                        C. integer
                        D.String""";
                break;
            case "q2":
                question += """
                        Which one is written in correct format?
                        A.System.out.println('%d%n','name');
                        B.System.out.println(%d%n,'name');
                        C.System.out.println(name);
                        D.System.out.printf('%s%n','name');""";
                break;
            case "q3":
                question += """
                        Which value of x that the program returns false?
                        if(x!=10 || x >= 9)
                        {
                        return true
                        }
                        A. x = 8
                        B. x = 9
                        C. x = 10
                        D. x = 11""";
                break;
            case "q4":
                question += """
                        For a Java developer, which is a wrong naming convention?
                        A. Variable names start with a lowercase character for the first word and uppercase for every other word\r
                        B. Classes start with an uppercase character of every word\r
                        C. Methods start with a lowercase character for the first word and lowercase for every other word\r
                        D. Packages use only lowercase characters\r
                        """;
                break;
            case "q5":
                question += """
                        a = ?
                        int a = 2 * 9 + 20 % 9;
                        A. 1
                        B. 2
                        C. 19
                        D. 20
                        """;
                break;
        }

        return question;

    }

}
