package nl.veurink.responsive;

import org.w3c.dom.ranges.RangeException;

import java.util.Random;

public abstract class BaseAnswerStrategy implements AnswerStrategy {
    private final Random randomizer = new Random();

    @Override
    public String getAnswer(String question) {
        String answerString;
        int answer = randomizer.nextInt(8) + 1;
        switch (answer) {
            case 1:
                answerString = getItIsCertain();
                break;
            case 2:
                answerString = getOutlookGood();
                break;
            case 3:
                answerString = getYouMayRelyOnIt();
                break;
            case 4:
                answerString = getAskAgainLater();
                break;
            case 5:
                answerString = getConcentrateAndAskAgain();
                break;
            case 6:
                answerString = getReplyHazy();
                break;
            case 7:
                answerString = getReplyNo();
                break;
            case 8:
                answerString = getMySourceSaysNo();
                break;
            default:
                throw new RangeException((short) 8, "out of range answer: " + answer);
        }
        return answerString;
    }

    protected abstract String getItIsCertain();
    protected abstract String getOutlookGood();
    protected abstract String getYouMayRelyOnIt();
    protected abstract String getAskAgainLater();
    protected abstract String getConcentrateAndAskAgain();
    protected abstract String getReplyHazy();
    protected abstract String getReplyNo();
    protected abstract String getMySourceSaysNo();
}
