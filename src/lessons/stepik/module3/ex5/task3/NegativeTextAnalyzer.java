package lessons.stepik.module3.ex5.task3;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    @Override
    public Label processText(String text) {
        return null;
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
