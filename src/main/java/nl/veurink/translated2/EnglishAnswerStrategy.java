package nl.veurink.translated2;

public class EnglishAnswerStrategy extends BaseAnswerStrategy {
    @Override
    public String getQuestion() {
        return "Ask the magic 8 ball a question: (press enter to quit)";
    }

    @Override
    protected String getItIsCertain() {
        return "It is certain";
    }

    @Override
    protected String getOutlookGood() {
        return "Outlook good";
    }

    @Override
    protected String getYouMayRelyOnIt() {
        return "You may rely on it";
    }

    @Override
    protected String getAskAgainLater() {
        return "Ask again later";
    }

    @Override
    protected String getConcentrateAndAskAgain() {
        return "Concentrate and ask again";
    }

    @Override
    protected String getReplyHazy() {
        return "Reply hazy, try again";
    }

    @Override
    protected String getReplyNo() {
        return "My reply is no";
    }

    @Override
    protected String getMySourceSaysNo() {
        return "My sources say no";
    }
}
