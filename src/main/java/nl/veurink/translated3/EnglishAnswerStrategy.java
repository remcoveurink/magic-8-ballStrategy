package nl.veurink.translated3;

import org.w3c.dom.ranges.RangeException;

import java.util.Random;

public class EnglishAnswerStrategy implements AnswerStrategy {
    private final Random randomizer = new Random();

    @Override
    public String getQuestion() {
        return "Ask the magic 8 ball a question: (press enter to quit)";
    }

    @Override
    public String getAnswer(String question) {
        String answerString;
        int answer = randomizer.nextInt(8) + 1;
        switch (answer) {
            case 1:
                answerString = "It is certain";
                break;
            case 2:
                answerString = "Outlook good";
                break;
            case 3:
                answerString = "You may rely on it";
                break;
            case 4:
                answerString = "Ask again later";
                break;
            case 5:
                answerString = "Concentrate and ask again";
                break;
            case 6:
                answerString = "Reply hazy, try again";
                break;
            case 7:
                answerString = "My reply is no";
                break;
            case 8:
                answerString = "My sources say no";
                break;
            default:
                throw new RangeException((short) 8, "out of range answer: " + answer);
        }
        return answerString;
    }
}
