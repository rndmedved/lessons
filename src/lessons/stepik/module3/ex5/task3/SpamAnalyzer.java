package lessons.stepik.module3.ex5.task3;

public class SpamAnalyzer extends KeywordAnalyzer{
    private final String[] keywords = {":(","=(",":|"};
    @Override
    public Label processText(String text) {
        return null;
    }

    public SpamAnalyzer(String[] keywords) {

    }

    @Override
    String[] getKeywords() {

        return new String[0];
    }

    @Override
    Label getLabel() {

        return null;
    }
}
