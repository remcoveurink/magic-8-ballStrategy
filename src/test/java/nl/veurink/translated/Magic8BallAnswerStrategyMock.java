package nl.veurink.translated;

public class Magic8BallAnswerStrategyMock implements AnswerStrategy {
    private int lastRequestedAnswer = 0;

    @Override
    public String getQuestion() {
        return "test";
    }

    @Override
    public String getAnswer(int answer) {
        lastRequestedAnswer = answer;
        return "MockedResponse";
    }

    public int getLastRequestedAnswer() {
        return lastRequestedAnswer;
    }
}
