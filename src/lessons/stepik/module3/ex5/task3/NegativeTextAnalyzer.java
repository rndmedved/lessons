package lessons.stepik.module3.ex5.task3;

public class NegativeTextAnalyzer extends KeywordAnalyzer{

    @Override
    String[] getKeywords() {
        return new String[0];
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
