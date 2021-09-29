package nl.veurink.translated2;

import nl.veurink.translatedwithbase.AnswerStrategy;

public class Magic8BallAnswerStrategyMock implements AnswerStrategy {
    private String lastRequestedQuestion;

    @Override
    public String getQuestion() {
        return "test";
    }

    @Override
    public String getAnswer(String question) {
        lastRequestedQuestion = question;
        return "MockedResponse";
    }

    public String getLastRequestedAnswer() {
        return lastRequestedQuestion;
    }
}
