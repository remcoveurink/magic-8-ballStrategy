package nl.veurink.responsive;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        AnswerFactory answerFactory = new AnswerFactory();
        AnswerStrategy answerStrategy = answerFactory.createAnswerStrategyBasedOnLocale();

        Magic8Ball magic8Ball = new Magic8Ball(answerStrategy);
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
