package nl.veurink.translated2;

/**
 * Interface (strategy pattern), but very tight contract which is bound to be extended
 */
public interface AnswerStrategy {
    public String getQuestion();
    public String getItIsCertain();
    public String getOutlookGood();
    public String getYouMayRelyOnIt();
    public String getAskAgainLater();
    public String getConcentrateAndAskAgain();
    public String getReplyHazy();
    public String getReplyNo();
    public String getMySourceSaysNo();
}
