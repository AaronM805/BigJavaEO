package ch09Inheritance.chapter_examples.section3;

import ch09Inheritance.chapter_examples.section1.Question;

import java.util.ArrayList;
import java.util.List;
/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
    private List<String> choices;

    /**
     * Constructs a choice question with no choices.
     */
    public ChoiceQuestion() {
        choices = new ArrayList<>();
    }

    /**
     * Adds an answer choice to this question.
     *
     * @param choice the choice to add
     * @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);

        if (correct) {
            // Convert choices.size() to string
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    @Override
    public void display() {
        // Display the question text
        super.display();
        
        // Display the answer choices
        for(int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}