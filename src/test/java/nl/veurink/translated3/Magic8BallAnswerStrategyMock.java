package nl.veurink.translated3;

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

    public String getLastRequestedQuestion() {
        return lastRequestedQuestion;
    }
}
