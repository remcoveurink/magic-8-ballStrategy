package nl.veurink.translatedwithbase;

import java.util.Scanner;

public class Magic8Ball {
    private final AnswerStrategy answerStrategy;

    public Magic8Ball(AnswerStrategy answerStrategy) {
        this.answerStrategy = answerStrategy;
    }

    public String getQuestion() {
        return answerStrategy.getQuestion();
    }

    public void handleQuestion(String question) {
        System.out.println(answerStrategy.getAnswer(question));
    }

    public static void main(String[] args) {
        Magic8Ball magic8Ball = new Magic8Ball(new EnglishAnswerStrategy());
        Scanner myObj = new Scanner(System.in);
        System.out.println(magic8Ball.getQuestion());

        while(true) {
            String question = myObj.nextLine();
            if ("".equals(question)) {
                System.exit(0);
            }
            magic8Ball.handleQuestion(question);
        }
    }
}