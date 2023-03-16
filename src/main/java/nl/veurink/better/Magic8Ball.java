package nl.veurink.better;

import nl.veurink.translated.AnswerStrategy;
import nl.veurink.translated.DutchAnswerStrategy;
import org.w3c.dom.ranges.RangeException;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    private Random randomizer;

    public Magic8Ball() {randomizer = new Random();}

    public String getQuestion() {
        return "Stel de magische 8 bal een ja/nee vraag: (druk op enter om te stoppen)";
    }

    public String handleQuestion(String question) {
        String answer = "";
        int answers = randomizer.nextInt(8) + 1;
        switch (answers) {
            case 1:
                answer = "Het is zeker";
                break;
            case 2:
                answer = "Goed vooruitzicht";
                break;
            case 3:
                answer = "Je kunt erop vertrouwen";
                break;
            case 4:
                answer = "Vraag later opnieuw";
                break;
            case 5:
                answer = "Concentreer je en vraag opnieuw";
                break;
            case 6:
                answer = "Reactie is wazig, probeer opnieuw";
                break;
            case 7:
                answer = "Mijn antwoord is nee";
                break;
            case 8:
                answer = "Mijn bronnen zeggen nee";
                break;
            default:
                throw new RangeException((short) 8, "out of range answer: " + answers);
        }
        return answer;
    }

    public static void main(String[] args) {
        Magic8Ball magic8Ball = new Magic8Ball();
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