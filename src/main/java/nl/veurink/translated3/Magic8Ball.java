package nl.veurink.translated3;

import java.util.Random;
import java.util.Scanner;

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
        return answerStrategy.getAnswer(question);
    }

    public static void main(String[] args) {
        Magic8Ball magic8Ball = new Magic8Ball(new DutchAnswerStrategy());
        Scanner myObj = new Scanner(System.in);
        System.out.println(magic8Ball.getQuestion());

        while(true) {
            String question = myObj.nextLine();
            if ("".equals(question)) {
                System.exit(0);
            }
            System.out.println(magic8Ball.handleQuestion(question));
        }
    }
}