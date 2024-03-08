package nl.veurink.responsive;

import java.util.Scanner;

public class Magic8Ball {
    private final AnswerStrategy answerStrategy;

    public Magic8Ball(AnswerStrategy answerStrategy) {
        this.answerStrategy = answerStrategy;
    }

    public String getQuestion() {
        return answerStrategy.getQuestion();
    }

    public String handleQuestion(String question) {
        return answerStrategy.getAnswer(question);
    }
}