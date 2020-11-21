package ch09_inheritance.chapter_examples.section3;

import java.util.Scanner;

/**
 * This program shows a simple quiz with two choice questions.
 */
public class QuestionTester {
    public static void main(String[] args) {
        ChoiceQuestion first = new ChoiceQuestion();
        first.setText("What was the original name of the Java language?");
        first.addChoice("*7", false);
        first.addChoice("Duke", false);
        first.addChoice("Oak", true);
        first.addChoice("Gosling", false);

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        presentQuestion(first);
        presentQuestion(second);
    }

    private static void presentQuestion(ChoiceQuestion question) {
        question.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(question.checkAnswer(response));
    }
}