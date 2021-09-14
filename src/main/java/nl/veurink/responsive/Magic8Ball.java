package nl.veurink.responsive;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        AnswerFactory answerFactory = new AnswerFactory();
        AnswerStrategy answerStrategy = answerFactory.createAnswerStrategyBasedOnLocale();
        Scanner myObj = new Scanner(System.in);
        System.out.println(answerStrategy.getQuestion());

        while(true) {
            String question = myObj.nextLine();
            if ("".equals(question)) {
                System.exit(0);
            }
            System.out.println(answerStrategy.getAnswer(question));
        }
    }
}