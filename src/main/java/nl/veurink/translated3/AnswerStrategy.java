package nl.veurink.translated3;

/**
 * Interface (strategy pattern), but very generic so open for all kinds of extension
 */
public interface AnswerStrategy {
    public String getQuestion();
    public String getAnswer(String question);
}
