package nl.veurink.translated;

/**
 * Interface (strategy pattern), but expects the answer as a integer number (specific to magic-8-ball)
 */
public interface AnswerStrategy {
    public String getQuestion();
    public String getAnswer(int answer);
}
