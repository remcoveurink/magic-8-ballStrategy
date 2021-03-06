package nl.veurink.translated2;


public class DutchAnswerStrategy implements AnswerStrategy {

    @Override
    public String getQuestion() {
        return "Stel de magische 8 bal een ja/nee vraag: (druk op enter om te stoppen)";
    }

    @Override
    public String getItIsCertain() {
        return "Het is zeker";
    }

    @Override
    public String getOutlookGood() {
        return "Goed vooruitzicht";
    }

    @Override
    public String getYouMayRelyOnIt() {
        return "Je kunt erop vertrouwen";
    }

    @Override
    public String getAskAgainLater() {
        return "Vraag later opnieuw";
    }

    @Override
    public String getConcentrateAndAskAgain() {
        return "Concentreer je en vraag opnieuw";
    }

    @Override
    public String getReplyHazy() {
        return "Reactie is wazig, probeer opnieuw";
    }

    @Override
    public String getReplyNo() {
        return "Mijn antwoord is nee";
    }

    @Override
    public String getMySourceSaysNo() {
        return "Mijn bronnen zeggen nee";
    }
}
