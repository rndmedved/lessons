package lessons.stepik.module3.ex5.task3;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract String[] getKeywords();
    abstract Label getLabel();

    public Label processText(String string) {
        for (int i = 0; i < getKeywords().length; i++) {
            if (string.contains(getKeywords()[i])) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
