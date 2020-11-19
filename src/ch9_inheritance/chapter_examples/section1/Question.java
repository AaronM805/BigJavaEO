package ch9_inheritance.chapter_examples.section1;
/**
 * A question with a text and an answer.
 */
public class Question {
    private String text;
    private String answer;

    /**
     * Constructs a question with empty question and answer.
     */
    public Question() {
        text = "";
        answer = "";
    }

    /**
     * Sets the qustion text.
     *
     * @param questionText the next text of this question
     */
    public void setText(String questionText) {
        this.text = questionText;
    }

    /**
     * Sets the answer for this question.
     *
     * @param correctResponse the answer
     */
    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }

    /**
     * Checks a given response for correctness.
     *
     * @param response the response to check
     *
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response) {
        return answer.equals(response);
    }

    /**
     * Display the question.
     */
    public void display() {
        System.out.println(text);
        
    }
}