package nl.veurink.responsive;

import java.util.Locale;

public class AnswerFactory {

    public AnswerStrategy createAnswerStrategyBasedOnLocale() {
        AnswerStrategy strategy;
        switch (Locale.getDefault().getLanguage()) {
            case "EN":
                strategy = new ResponsiveStrategy(new EnglishAnswerStrategy());
                break;
            default:
                strategy = new ResponsiveStrategy(new DutchAnswerStrategy());
                break;
        }
        return strategy;
    }
}
