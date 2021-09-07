package nl.veurink.translated;

import java.util.Locale;

public class AnswerFactory {

    public AnswerStrategy createAnswerStrategyBasedOnLocale() {
        AnswerStrategy strategy;
        switch (Locale.getDefault().getLanguage()) {
            case "EN":
                strategy = new EnglishAnswerStrategy();
                break;
            default:
                strategy = new DutchAnswerStrategy();
                break;
        }
        return strategy;
    }
}
