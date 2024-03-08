package nl.veurink.translated2;

import org.w3c.dom.ranges.RangeException;

import java.util.Random;

public class Magic8Ball {
    private final AnswerStrategy answerStrategy;
    private final Random randomizer = new Random();

    public Magic8Ball(AnswerStrategy answerStrategy) {
        this.answerStrategy = answerStrategy;
    }

    public String getQuestion() {
        return answerStrategy.getQuestion();
    }

    public String handleQuestion(String question) {
        String answerString;
        int answer = randomizer.nextInt(8) + 1;
        switch (answer) {
            case 1:
                answerString = answerStrategy.getItIsCertain();
                break;
            case 2:
                answerString = answerStrategy.getOutlookGood();
                break;
            case 3:
                answerString = answerStrategy.getYouMayRelyOnIt();
                break;
            case 4:
                answerString = answerStrategy.getAskAgainLater();
                break;
            case 5:
                answerString = answerStrategy.getConcentrateAndAskAgain();
                break;
            case 6:
                answerString = answerStrategy.getReplyHazy();
                break;
            case 7:
                answerString = answerStrategy.getReplyNo();
                break;
            case 8:
                answerString = answerStrategy.getMySourceSaysNo();
                break;
            default:
                throw new RangeException((short) 8, "out of range answer: " + answer);
        }
        return answerString;
    }
}