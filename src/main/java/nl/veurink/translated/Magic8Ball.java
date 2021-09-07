package nl.veurink.translated;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
//        AnswerFactory answerFactory = new AnswerFactory();
//        AnswerStrategy answerStrategy = answerFactory.createAnswerStrategyBasedOnLocale();
        AnswerStrategy answerStrategy = new EnglishAnswerStrategy();
        Scanner myObj = new Scanner(System.in);
        System.out.println(answerStrategy.getQuestion());

        while(true) {
            String question = myObj.nextLine();
            if ("".equals(question)) {
                System.exit(0);
            }

            Random r = new Random();
            int answers = r.nextInt(8) + 1;
            System.out.println(answerStrategy.getAnswer(answers));
        }
    }
}