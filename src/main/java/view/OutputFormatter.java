package view;

import domain.Line;
import domain.Step;
import java.util.List;
import java.util.stream.Collectors;

public class OutputFormatter {
    private static final String SPACE = " ";
    private static final String BAR = "|";

    public String toNameUnit(List<String> players) {
        return players.stream()
                .map(this::getNameUnit)
                .collect(Collectors.joining());
    }

    public String toLine(Line rawLine) {
        String line = rawLine.getSteps().stream()
                .map(this::getStep)
                .collect(Collectors.joining());
        return "    " + line;
    }

    public String toPrize(List<String> rawPrizes) {
        return rawPrizes.stream()
                .map(this::getPrizeUnit)
                .collect(Collectors.joining());
    }

    private String getPrizeUnit(String prize) {
        if (prize.length() < 5) {
            String leftBlank = SPACE.repeat(4 - prize.length());
            prize = leftBlank + prize + SPACE;
        }
        return prize + SPACE;
    }

    private String getNameUnit(String name) {
        if (name.length() < 5) {
            String leftBlank = SPACE.repeat(4 - name.length());
            name = leftBlank + name + SPACE;
        }
        return name + SPACE;
    }

    private String getStep(Step step) {
        if (step.isExist()) {
            return BAR + "-----";
        }
        return BAR + "     ";
    }
}
