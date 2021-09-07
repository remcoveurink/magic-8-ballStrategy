package nl.veurink.bloated;

import org.w3c.dom.ranges.RangeException;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Stel de magische 8 bal een ja/nee vraag: (druk op enter om te stoppen)");

        while(true) {
            String question = myObj.nextLine();
            if ("".equals(question)) {
                System.exit(0);
            }

            Random r = new Random();
            int answers = r.nextInt(8) + 1;
            switch (answers) {
                case 1:
                    System.out.println("Het is zeker");
                    break;
                case 2:
                    System.out.println("Goed vooruitzicht");
                    break;
                case 3:
                    System.out.println("Je kunt erop vertrouwen");
                    break;
                case 4:
                    System.out.println("Vraag later opnieuw");
                    break;
                case 5:
                    System.out.println("Concentreer je en vraag opnieuw");
                    break;
                case 6:
                    System.out.println("Reactie is wazig, probeer opnieuw");
                    break;
                case 7:
                    System.out.println("Mijn antwoord is nee");
                    break;
                case 8:
                    System.out.println("Mijn bronnen zeggen nee");
                    break;
                default:
                    throw new RangeException((short) 8, "out of range answer: " + answers);
            }
        }
    }
}