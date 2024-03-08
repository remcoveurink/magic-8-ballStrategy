package nl.veurink.translated;

import java.util.Random;

public class Magic8Ball {
    private final AnswerStrategy answerStrategy;
    Random randomizer = new Random();

    public Magic8Ball(AnswerStrategy answerStrategy) {
        this.answerStrategy = answerStrategy;
    }

    public String getQuestion() {
        return answerStrategy.getQuestion();
    }

    public String handleQuestion(String question) {
        int answers = randomizer.nextInt(8) + 1;
        return answerStrategy.getAnswer(answers);
    }
}