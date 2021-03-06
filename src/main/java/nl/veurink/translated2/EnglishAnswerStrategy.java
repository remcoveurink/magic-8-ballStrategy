package nl.veurink.translated2;

public class EnglishAnswerStrategy implements AnswerStrategy {
    @Override
    public String getQuestion() {
        return "Ask the magic 8 ball a question: (press enter to quit)";
    }

    @Override
    public String getItIsCertain() {
        return "It is certain";
    }

    @Override
    public String getOutlookGood() {
        return "Outlook good";
    }

    @Override
    public String getYouMayRelyOnIt() {
        return "You may rely on it";
    }

    @Override
    public String getAskAgainLater() {
        return "Ask again later";
    }

    @Override
    public String getConcentrateAndAskAgain() {
        return "Concentrate and ask again";
    }

    @Override
    public String getReplyHazy() {
        return "Reply hazy, try again";
    }

    @Override
    public String getReplyNo() {
        return "My reply is no";
    }

    @Override
    public String getMySourceSaysNo() {
        return "My sources say no";
    }
}
