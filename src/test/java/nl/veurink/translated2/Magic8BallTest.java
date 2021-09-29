package nl.veurink.translated2;

import nl.veurink.translatedwithbase.Magic8Ball;
import org.junit.Assert;
import org.junit.Test;

public class Magic8BallTest {
    @Test
    public void answerStrategy() {
        Magic8BallAnswerStrategyMock answerStrategyMock = new Magic8BallAnswerStrategyMock();
        Magic8Ball magic8Ball = new Magic8Ball(answerStrategyMock);
        String question = magic8Ball.getQuestion();
        magic8Ball.handleQuestion(question);
        String answer = answerStrategyMock.getLastRequestedAnswer();
        Assert.assertEquals(question, answer);
    }
}
