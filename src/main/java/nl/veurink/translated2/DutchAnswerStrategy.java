package nl.veurink.translated2;

public class DutchAnswerStrategy extends BaseAnswerStrategy {

    @Override
    public String getQuestion() {
        return "Stel de magische 8 bal een ja/nee vraag: (druk op enter om te stoppen)";
    }

    @Override
    protected String getItIsCertain() {
        return "Het is zeker";
    }

    @Override
    protected String getOutlookGood() {
        return "Goed vooruitzicht";
    }

    @Override
    protected String getYouMayRelyOnIt() {
        return "Je kunt erop vertrouwen";
    }

    @Override
    protected String getAskAgainLater() {
        return "Vraag later opnieuw";
    }

    @Override
    protected String getConcentrateAndAskAgain() {
        return "Concentreer je en vraag opnieuw";
    }

    @Override
    protected String getReplyHazy() {
        return "Reactie is wazig, probeer opnieuw";
    }

    @Override
    protected String getReplyNo() {
        return "Mijn antwoord is nee";
    }

    @Override
    protected String getMySourceSaysNo() {
        return "Mijn bronnen zeggen nee";
    }
}
