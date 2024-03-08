package nl.veurink.translatedwithbase;

import java.util.Scanner;

public class Application {
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
