package nl.veurink.translated;

import org.w3c.dom.ranges.RangeException;

public class DutchAnswerStrategy implements AnswerStrategy {
    @Override
    public String getQuestion() {
        return "Stel de magische 8 bal een ja/nee vraag: (druk op enter om te stoppen)";
    }

    @Override
    public String getAnswer(int answer) {
        String answerString;
        switch (answer) {
            case 1:
                answerString = "Het is zeker";
                break;
            case 2:
                answerString = "Goed vooruitzicht";
                break;
            case 3:
                answerString = "Je kunt erop vertrouwen";
                break;
            case 4:
                answerString = "Vraag later opnieuw";
                break;
            case 5:
                answerString = "Concentreer je en vraag opnieuw";
                break;
            case 6:
                answerString = "Reactie is wazig, probeer opnieuw";
                break;
            case 7:
                answerString = "Mijn antwoord is nee";
                break;
            case 8:
                answerString = "Mijn bronnen zeggen nee";
                break;
            default:
                throw new RangeException((short) 8, "out of range answer: " + answer);
        }
        return answerString;
    }
}
