package nl.veurink.translated3;

import org.junit.Assert;
import org.junit.Test;

public class Magic8BallTest {
    @Test
    public void answerStrategy() {
        Magic8BallAnswerStrategyMock answerStrategyMock = new Magic8BallAnswerStrategyMock();
        Magic8Ball magic8Ball = new Magic8Ball(answerStrategyMock);
        String question = magic8Ball.getQuestion();
        String answer = magic8Ball.handleQuestion(question);
        Assert.assertEquals("MockedResponse", answer);
        String questionRequested = answerStrategyMock.getLastRequestedQuestion();
        Assert.assertEquals(question, questionRequested);
    }
}
